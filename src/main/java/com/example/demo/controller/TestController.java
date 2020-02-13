package com.example.demo.controller;

import com.example.demo.service.DocumentService;
import com.example.demo.service.MailService;
import com.example.demo.service.StampService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@AllArgsConstructor
public class TestController {

    private final DocumentService documentService;
    private final MailService mailService;
    private final StampService stampService;

    @GetMapping("/test")
    public Mono<String> test() {
        return Mono.just("111222333");
    }
}
