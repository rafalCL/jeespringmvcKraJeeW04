package pl.coderslab.jeespringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class RedirectionExampleController {
    @GetMapping("/first")
    public String first(HttpServletRequest request) {
        return "redirect:second";
    }

    @GetMapping("/second")
    @ResponseBody
    public String second(HttpServletRequest request) {
        return "you are in second";
    }
}
