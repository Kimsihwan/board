package com.board.web;

import java.util.List;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.board.web.board.dao.BoardDAO;
import com.board.web.board.model.BoardVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
    locations = {"classpath:spring/root-context.xml", "classpath:srping/dataSource-context.xml"})
public class BoardDAOTest {
  private static final Logger LOGGER = LoggerFactory.getLogger(BoardDAOTest.class);

  @Autowired
  private BoardDAO boardDAO;

  // 게시글 리스트 조회
  @Test

  public void testGetBoardList() throws Exception {
    List<BoardVO> boardList = boardDAO.getBoardList();
    LOGGER.info("\n Board List \n ");
    if (boardList.size() > 0) {
      for (BoardVO list : boardList) {
        LOGGER.info(list.getTitle());
      }
    } else {
      LOGGER.info("데이터가 없습니다.");
    }
  }

  // 게시글 가져오기
  @Test
  @Ignore
  public void testGetBoardContent() throws Exception {
    BoardVO boardVO = boardDAO.getBoardContent(1);
    LOGGER.info("\n Board List \n");
    if (boardVO != null) {
      LOGGER.info("글번호 : " + boardVO.getBid());
      LOGGER.info("글카테고리 : " + boardVO.getCate_cd());
      LOGGER.info("글제목 : " + boardVO.getTitle());
      LOGGER.info("글내용 : " + boardVO.getContent());
      LOGGER.info("글태그 : " + boardVO.getTag());
      LOGGER.info("조회수 : " + boardVO.getView_cnt());
      LOGGER.info("작성자 : " + boardVO.getBid());
      LOGGER.info("작성일 : " + boardVO.getReg_dt());
      LOGGER.info("수정일 : " + boardVO.getEdit_dt());
    } else {
      LOGGER.info("데이터가 없습니다.");
    }
  }

  /// 게시글 작성
  @Test
  @Ignore
  public void testInsertBoard() throws Exception {
    BoardVO boardVO = new BoardVO();
    boardVO.setCate_cd("1");
    boardVO.setTitle("첫번째 게시물 제목");
    boardVO.setContent("첫번째 게시물 내용");
    boardVO.setTag("1");
    boardVO.setReg_id("1");

    int result = boardDAO.insertBoard(boardVO);
    LOGGER.info("\n Insert Board Result " + result);
    if (result == 1) {
      LOGGER.info("\n 게시물 등록 성공");
    } else {
      LOGGER.info("\n 게시물 등록 실패");
    }
  }
  
  // 게시글 수정
  @Test
  @Ignore
  public void testUpdateBoard() throws Exception {
    BoardVO boardVO = new BoardVO();
    boardVO.setBid(1);
    boardVO.setCate_cd("1");
    boardVO.setCate_cd("1");
    boardVO.setTitle("첫번째 게시물 제목-수정");
    boardVO.setContent("첫번째 게시물 내용-수정");
    boardVO.setTag("1-1");
    
    int result = boardDAO.updateBoard(boardVO);
    LOGGER.info("\n Update Board Result \n");
    if(result > 0 ) {
      LOGGER.info("\n 게시물 수정 성공");
    } else {
      LOGGER.info("\n 게시물 수정 실패");
    }
  }
  
  // 게시글 삭제
  @Test
  @Ignore
  public void testDeleteBoard() throws Exception {
    int result = boardDAO.deleteBoard(1);
    LOGGER.info("\n Delete Board Result \n ");
    if(result > 0) {
      LOGGER.info("\n 게시글 삭제 성공");
    } else {
      LOGGER.info("\n 게시글 삭제 실패");
    }
  }
  
  // 게시글 조회수 업데이트
  @Test
  @Ignore
  public void testUpdateViewCnt() throws Exception {
    int result = boardDAO.updateViewCnt(1);
    LOGGER.info("\n Update View Count Result \n ");
    if(result > 0) {
      LOGGER.info("\n 게시물 조회수 업데이트 성공");
    } else {
      LOGGER.info("\n 게시물 조회수 업데이트 실패");
    }
  }
}
