package kr.co.h4tech.springboot.web;

import kr.co.h4tech.springboot.web.dao.HelloResponseDao;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/hello/dao")
    public HelloResponseDao helloDao(String name, int amount) {
        return new HelloResponseDao(name, amount);
    }

}
