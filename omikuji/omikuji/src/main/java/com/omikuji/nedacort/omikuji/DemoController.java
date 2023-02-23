package com.omikuji.nedacort.omikuji;

import org.springframework.ui.Model;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemoController {

    @RequestMapping("/omikuji")
    public String omikuji() {
        return "formulario.jsp";
    }

    @PostMapping("/omikuji")
    public String omikuji(@RequestParam Integer pick,
            @RequestParam String city,
            @RequestParam String person,
            @RequestParam String profesion,
            @RequestParam String living,
            @RequestParam String someone, HttpSession session) {
        session.setAttribute("pick", pick);
        session.setAttribute("city", city);
        session.setAttribute("person", person);
        session.setAttribute("profesion", profesion);
        session.setAttribute("living", living);
        session.setAttribute("someone", someone);
        return "redirect:/omikuji/show";
    }

    @GetMapping("/omikuji/show")
    public String omikujiShow(HttpSession session, Model model) {
        System.out.println(session.getAttribute("pick"));
        model.addAttribute("pickM", session.getAttribute("pick"));
        model.addAttribute("cityM", session.getAttribute("city"));
        model.addAttribute("personM", session.getAttribute("person"));
        model.addAttribute("profesionM", session.getAttribute("profesion"));
        model.addAttribute("livingM", session.getAttribute("living"));
        model.addAttribute("someoneM", session.getAttribute("someone"));
        return "show.jsp";
    }
}
