package flab.prestudy.simpleserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static java.lang.Thread.sleep;

@RestController
public class SimpleController {
    @GetMapping("/hello")
    String sayHello() {
        return "Hello";
    }

    @GetMapping("/v1/hello")
    String sayV1Hello() throws InterruptedException {
        sleep(1000);
        return "v1 Hello";
    }
}
