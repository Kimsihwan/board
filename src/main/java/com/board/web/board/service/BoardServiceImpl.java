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

  @Override
  public List<BoardVO> getBoardList() throws Exception {
    return boardDAO.getBoardList();
  }

}
