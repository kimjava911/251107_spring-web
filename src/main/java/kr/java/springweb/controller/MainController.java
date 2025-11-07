package kr.java.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller // @Component
@RestController // REST API <- 페이지가 아니라 데이터를 전달하는 방식
@RequestMapping // ("/")
public class MainController {
    @GetMapping // ("/")
    public String hello() {
        return "hello spring";
    }
}
