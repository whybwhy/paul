package org.paul.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.paul.domain.BoardVO;
import org.paul.service.BoardService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@Slf4j
@RequestMapping("/board/*")
@AllArgsConstructor
public class BoardController {

    private BoardService service;

    @GetMapping("/list")
    public void list(Model model) {
        model.addAttribute("list", service.getList());
    }

    @GetMapping("/get")
    public void read(@RequestParam("bno") Long bno, Model model) {
        model.addAttribute("board", service.get(bno));
    }

    @PostMapping("/register")
    public String register(BoardVO board, RedirectAttributes redirectAttributes) {
        service.register(board);
        redirectAttributes.addFlashAttribute("result", board.getBno());
        return "redirect:/board/list";
    }



    @PostMapping("/modify")
    public String modify(BoardVO board, RedirectAttributes redirectAttributes) {
        service.modify(board);
        return "redirect:/board/get?bno=" + board.getBno();
    }

    @GetMapping("/remove")
    public String remove(@RequestParam("bno") Long bno, RedirectAttributes redirectAttributes) {
        service.remove(bno);
        return "redirect:/board/list";
    }
}
