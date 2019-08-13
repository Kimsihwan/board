package com.board.web.board.dao;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.board.web.board.model.BoardVO;

@Repository
public class BoardDAOImpl implements BoardDAO {
  
  @Autowired
  private SqlSession sqlSession;

  // 게시글 목록 출력
  @Override
  public List<BoardVO> getBoardList() throws Exception { 
    return sqlSession.selectList("com.board.web.board.boardMapper.getBoardList");
  }

  // 게시글 내용 출력
  @Override
  public BoardVO getBoardContent(int bid) throws Exception {
    return sqlSession.selectOne("com.board.web.board.boardMapper.getBoardContent", bid);
  }

  // 게시글 입력
  @Override
  public int insertBoard(BoardVO boardVO) throws Exception {
    return sqlSession.insert("com.board.web.board.boardMapper.insertBoard", boardVO);
  }

  // 게시글 업데이트
  @Override
  public int updateBoard(BoardVO boardVO) throws Exception {
    return sqlSession.update("com.board.web.board.boardMapper.updateBoard", boardVO);
  }

  // 게시글 삭제
  @Override
  public int deleteBoard(int bid) throws Exception {
    return sqlSession.insert("com.board.web.board.boardMapper.deleteBoard", bid);
  }

  // 게시글 조회수 업데이트
  @Override
  public int updateViewCnt(int bid) throws Exception {
    return sqlSession.update("com.board.web.board.boardMapper.updateViewCnt", bid);
  }

}
