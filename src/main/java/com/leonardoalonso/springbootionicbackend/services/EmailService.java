package com.leonardoalonso.springbootionicbackend.services;

import org.springframework.mail.SimpleMailMessage;

import com.leonardoalonso.springbootionicbackend.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);

	void sendEmail(SimpleMailMessage msg);
}
