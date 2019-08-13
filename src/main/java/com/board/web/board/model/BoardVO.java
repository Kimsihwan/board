package com.board.web.board.model;

import lombok.Data;

@Data
public class BoardVO {
  // 게시글 번호
  private int bid;
  // 카테고리
  private String cate_cd;
  // 게시글 제목
  private String title;
  // 게시글 내용
  private String content;
  // 게시글 태그
  private String tag;
  // 게시글 조회수
  private int view_cnt;
  // 게시글 작성자
  private String reg_id;
  // 게시글 등록 날짜
  private String reg_dt;
  // 게시글 수정 날짜
  private String edit_dt;
}
