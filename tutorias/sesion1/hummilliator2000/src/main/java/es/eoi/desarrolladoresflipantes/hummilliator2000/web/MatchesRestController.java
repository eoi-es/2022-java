package es.eoi.desarrolladoresflipantes.hummilliator2000.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MatchesRestController {

    @GetMapping("/api/matches")
    public String hello() {
        return "hello world";
    }
}
