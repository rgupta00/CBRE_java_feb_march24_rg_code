package com.productapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorInfo {
    private String errorMessage;
    private String toContact;
    private String httpStatusCode;
    private LocalDateTime localDateTime;
    private String url;
}
