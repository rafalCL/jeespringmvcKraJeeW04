package pl.coderslab.jeespringmvc.controller.session.twocontrollersexample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes({"test"})
public class Ex2Controller {
    @GetMapping("/m2")
    @ResponseBody
    public String m2(Model m){
        m.addAttribute("test", 11);
        return "ustawiono atrybut test=11 z sesją";
    }
}
