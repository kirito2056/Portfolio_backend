package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class maincontroller{
    @RequestMapping("/")
    private String mainpage() {
        return ("메인페이지 도착");
    }
}
