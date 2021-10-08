package spring_project.board.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring_project.board.domain.entity.Board;

import java.util.List;

public interface BoardRepository extends JpaRepository<Board, Long> {
    List<Board> findByTitleContaining(String keyword);
}
