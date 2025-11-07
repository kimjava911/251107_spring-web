package kr.java.springweb.controller;

import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // @Component
//@RestController // REST API <- 페이지가 아니라 데이터를 전달하는 방식
@RequestMapping // ("/")
public class MainController {
//    @GetMapping // ("/")
//    public String hello() {
//        return "hello spring";
//    }
    @GetMapping
//    public String hello(Model model, HttpSession session, @CookieValue String name, HttpServletResponse response) { // bean 의존성 주입 개념.
    public String hello() { // bean 의존성 주입 개념.
//        model.addAttribute()
//        return "hello.jsp"; // forward.
//        return "WEB-INF/views/hello.jsp"; // forward.
        return "hello"; // view resolver 작동하면서 앞뒤에 prefix suffix 경로를 붙여줘서
    }
}
