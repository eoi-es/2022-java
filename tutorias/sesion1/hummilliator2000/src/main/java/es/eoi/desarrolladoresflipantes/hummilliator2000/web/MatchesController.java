package es.eoi.desarrolladoresflipantes.hummilliator2000.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MatchesController {

    @GetMapping("/matches")
    public String hello() {
        return "hello";
    }
}
