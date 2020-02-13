package com.example.demo.service;

import com.example.demo.model.DocumentItem;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class DocumentService {
    public Mono<List<DocumentItem>> getList() {
        return Mono.just(List.of(
                        DocumentItem.builder().id("1").build(),
                        DocumentItem.builder().id("2").build(),
                        DocumentItem.builder().id("3").build()
                ));
    }

    public Mono<byte[]> download(String id) {
        return Mono.just(id.getBytes());
    }
}

