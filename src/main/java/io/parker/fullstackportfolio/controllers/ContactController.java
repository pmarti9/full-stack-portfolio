package io.parker.fullstackportfolio.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/messages")
public class ContactController {

    @GetMapping("/hello")
    public String hello() {
        return "Full stack java dev with spring boot and vue js.";
    }
}
