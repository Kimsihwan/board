package com.board.web.board.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.board.web.board.dao.BoardDAO;
import com.board.web.board.model.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {

  @Autowired
  private BoardDAO boardDAO;

  // 게시글 리스트 조회
  @Override
  public List<BoardVO> getBoardList() throws Exception {
    return boardDAO.getBoardList();
  }

  // 게시글 입력
  @Override
  public void insertBoard(BoardVO boardVO) throws Exception {
    boardDAO.insertBoard(boardVO);
  }

}
