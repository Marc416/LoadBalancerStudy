package flab.prestudy.simpleserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
    @GetMapping("/hello")
    String sayHello() {
        return "Hello";
    }

    @GetMapping("/v1/hello")
    String sayV1Hello() {
        return "v1 Hello";
    }
}
