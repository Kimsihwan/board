package com.board.web.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.board.web.board.service.BoardService;

@Controller
@RequestMapping(value = "/board")
public class BoardController {

  @Autowired
  private BoardService boardService;

  @RequestMapping(value = "/getBoardList", method = RequestMethod.GET)
  public String getBoardList(Model model) throws Exception {
    model.addAttribute("boardList", boardService.getBoardList());
    return "board/index";
  }

}
