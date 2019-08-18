package com.board.web.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.board.web.board.model.BoardVO;
import com.board.web.board.service.BoardService;

@Controller
@RequestMapping(value = "/board")
public class BoardController {

  @Autowired
  private BoardService boardService;

  // 게시글 리스트 조회
  @RequestMapping(value = "/getBoardList", method = RequestMethod.GET)
  public String getBoardList(Model model) throws Exception {
    model.addAttribute("boardList", boardService.getBoardList());
    return "board/index";
  }
  
  @RequestMapping("/boardForm")
  public String boardForm() {
    return "board/boardForm";
  }
  
  @RequestMapping(value = "/saveBoard", method = RequestMethod.POST)
  public String saveBoard(@ModelAttribute("BoardVO") BoardVO boardVO, RedirectAttributes rttr) throws Exception {
    boardService.insertBoard(boardVO);
    return "redirect:/board/getBoardList";
  } 

}
