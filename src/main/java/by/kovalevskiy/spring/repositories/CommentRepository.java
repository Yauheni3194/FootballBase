package by.kovalevskiy.spring.repositories;

import by.kovalevskiy.spring.model.Comment;
import by.kovalevskiy.spring.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment,Integer> {
    List<Comment> findByGame(Game game);
}
