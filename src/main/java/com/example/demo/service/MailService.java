package com.example.demo.service;

import com.example.demo.model.MailMessage;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.stream.Collectors;

@Service
public class MailService {
    public Mono<String> sendMail(MailMessage msg) {
        var str = msg.getAttachments().stream()
                .map(String::new)
                .sorted()
                .collect(Collectors.joining());
        return Mono.just(str);
    }
}

