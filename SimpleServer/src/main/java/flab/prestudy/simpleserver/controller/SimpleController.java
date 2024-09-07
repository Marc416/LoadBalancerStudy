package flab.prestudy.simpleserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
    @GetMapping("/hello")
    String getCbConsumer() {
        return "Hello";
    }
}
