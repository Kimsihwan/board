package com.board.web.board.service;

import java.util.List;
import com.board.web.board.model.BoardVO;

public interface BoardService {
  
  public List<BoardVO> getBoardList() throws Exception;
  
}