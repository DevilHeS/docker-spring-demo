package cn.unipus.demo.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${env}")
    private String env;

    @GetMapping(value = "/test")
    public String test() {
        return "env :" + env;
    }
}
