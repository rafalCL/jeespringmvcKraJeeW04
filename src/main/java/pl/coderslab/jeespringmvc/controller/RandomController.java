package pl.coderslab.jeespringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
@RequestMapping("/random")
public class RandomController {
    private Random rand = new Random();

    @GetMapping("/{max}")
    @ResponseBody
    public String max(@PathVariable int max){
        int result = rand.nextInt(max)+1;

        return "Wylosowano liczbę: "+result;
    }

    @GetMapping("/{min}/{max}")
    @ResponseBody
    public String max(@PathVariable int min, @PathVariable int max){
        int result = min + rand.nextInt(max-min+1);

        return "Wylosowano liczbę: "+result;
    }
}
