package pl.coderslab.jeespringmvc.controller.session.twocontrollersexample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Ex1Controller {
    @GetMapping("/m1")
    @ResponseBody
    public String m1(Model m){
        m.addAttribute("test", 42);
        return "ustawiono atrybut test=42 bez sesji";
    }
}
