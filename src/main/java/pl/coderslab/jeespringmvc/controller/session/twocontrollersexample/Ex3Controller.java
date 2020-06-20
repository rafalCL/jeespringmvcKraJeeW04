package pl.coderslab.jeespringmvc.controller.session.twocontrollersexample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpSession;

@Controller
@SessionAttributes({"test"})
public class Ex3Controller {
    @GetMapping("/m3")
    @ResponseBody
    public String m3(HttpSession s){
        return "pobrano atrybut test="+s.getAttribute("test");
    }
}
