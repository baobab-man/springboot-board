package spring_project.board.service;

import org.springframework.stereotype.Service;
import spring_project.board.domain.repository.BoardRepository;
import spring_project.board.dto.BoardDto;

import javax.transaction.Transactional;

@Service
public class BoardService {

    private final BoardRepository boardRepository;

    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    @Transactional
    public void savePost(BoardDto boardDto) {
        boardRepository.save(boardDto.toEntity());
    }
}
