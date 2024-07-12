package org.choongang.member.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/member")
public class MemberController {

    @GetMapping("/join")
    public String join() {

        return "member/join";
    }

    @PostMapping("/join")
    public String joinPs(RequestJoin form) {

        log.info(form.toString());

        return "member/join";
    }

    @GetMapping("/login")
    public String login() {

        return "member/login";
    }

    //private final Logger log = LoggerFactory.getLogger(MemberController.class);
    /*


    @PostMapping("/join")
    public String joinPs(RequestJoin form) {

       //return "redirect:/member/login"; // Location: /day05/member/login
        return "forward:/member/login"; // 버퍼 치환
    }
    @GetMapping("/join")
    public String join1() {

        log.info("{}, {} 없음", "mode1", "mode2");

        return "member/join";
    }

    @GetMapping(path="/join", params={"mode=join"})
    public String join() {

        log.info("mode=join");

        return "member/join";
    }



    @PostMapping(path="/join", headers="appKey=1234", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public String joinPs(RequestJoin form) {

        log.info("joinPs 실행...");

        return "redirect:/member/login";
    }
    */
    /*
    @GetMapping("/member/join")
    public ModelAndView join() {

        ModelAndView mv = new ModelAndView();
        mv.addObject("message", "안녕하세요.");
        mv.setViewName("member/join");

        return mv;
    }*/
}