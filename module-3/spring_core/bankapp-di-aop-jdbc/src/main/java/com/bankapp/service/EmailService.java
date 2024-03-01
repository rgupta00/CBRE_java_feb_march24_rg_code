package com.bankapp.service;

public interface EmailService {
    public void sendEmail(String to, String from, String message);
}
