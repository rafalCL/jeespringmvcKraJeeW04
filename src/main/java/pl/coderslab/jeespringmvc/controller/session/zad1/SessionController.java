package pl.coderslab.jeespringmvc.controller.session.zad1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.time.LocalDateTime;

@Controller
public class SessionController {
    @GetMapping("/zad1")
    @ResponseBody
    public String zad1(HttpSession ses){
        LocalDateTime loginStart = (LocalDateTime)ses.getAttribute("loginStart");

        if(loginStart==null){
            loginStart = LocalDateTime.now();
            ses.setAttribute("loginStart", loginStart);
            return "ustawiono wartość";
        }

        return loginStart.toString();
    }
}
