package org.choongang.member.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MemberController {
/*
    @GetMapping("/member/join")
    public String join() {
        model.addAttribute("message", "안녕하세요.");
        return "member/join";
    }
 */
    @GetMapping("/member/join")
    public ModelAndView join() {

        ModelAndView mv = new ModelAndView();
        mv.addObject("message", "안녕하세요.");

        return mv;
    }

}
