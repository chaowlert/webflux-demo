package com.example.demo.service;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class StampService {
    public Mono<byte[]> stamp(byte[] bytes) {
        return Mono.just(new String(bytes).repeat(3).getBytes());
    }
}
