package by.kovalevskiy.spring.repositories;

import by.kovalevskiy.spring.model.Place;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface PlaceRepository extends JpaRepository<Place, Integer> {
    boolean existsByNameAndAddress(String name, String addres);
    boolean existsByNameAndAddressAndIdNot(String name, String addres,int id);
    Optional<Place> findByName(String name);
}
