package pl.coderslab.jeespringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/form")
public class FormController {
    @GetMapping("/show")
    public String get(){
        return "form";
    }

    @PostMapping("/show")
    @ResponseBody
    public String post(@RequestParam String surname){
        return "działą! " + surname;
    }

    @GetMapping("/showUserForm")
    public String getUserForm(){
        return "user/user-form";
    }
}
