package com.board.web.board.service;

import java.util.List;
import java.util.Map;
import com.board.web.board.model.BoardVO;

public interface BoardService {
  
  // 게시글 리스트 조회
  public List<BoardVO> getBoardList() throws Exception;
  
  // 게시글 입력
  public void insertBoard(BoardVO boardVO) throws Exception;
  
}