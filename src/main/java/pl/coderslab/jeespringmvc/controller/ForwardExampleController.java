package pl.coderslab.jeespringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ForwardExampleController {
    @RequestMapping("/firstForward")
    public String firstForward(HttpServletRequest request) {
        return "forward:secondForward";
    }

    @RequestMapping("/secondForward")
    @ResponseBody
    public String secondForward() {
        return "second";
    }
}
