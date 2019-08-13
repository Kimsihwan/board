package com.board.web.board.dao;

import java.util.List;
import com.board.web.board.model.BoardVO;

public interface BoardDAO {
  
  // 게시글 목록 출력
  public List<BoardVO> getBoardList() throws Exception;
  
  // 게시글 내용 출력
  public BoardVO getBoardContent(int bid) throws Exception;
  
  // 게시글 입력
  public int insertBoard(BoardVO boardVO) throws Exception;
  
  // 게시글 업데이트
  public int updateBoard(BoardVO boardVO) throws Exception;
  
  // 게시글 삭제
  public int deleteBoard(int bid) throws Exception;
  
  // 게시글 조회수 업데이트
  public int updateViewCnt(int bid) throws Exception;
  
}
