package by.kovalevskiy.spring.repositories;

import by.kovalevskiy.spring.model.Game;
import by.kovalevskiy.spring.model.Place;
import by.kovalevskiy.spring.model.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public interface GameRepository extends JpaRepository<Game,Integer> {
    boolean existsByPlaceAndDateAndTimeAndIdNot(Place place, LocalDate date, LocalTime time, int id);

    boolean existsByPlaceAndDateAndTime(Place place, LocalDate date, LocalTime time);
    List<Game> findAllByOrderByDateAsc();

    @Query("SELECT COUNT(g) FROM Player p JOIN p.games g WHERE p.id = :playerId")
    long countGamesByPlayerId(@Param("playerId") Long playerId);
    List<Game> findAllByStatus(Status status);
}
