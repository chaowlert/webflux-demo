package com.example.demo.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class MailMessage {
    private List<byte[]> attachments;
}
