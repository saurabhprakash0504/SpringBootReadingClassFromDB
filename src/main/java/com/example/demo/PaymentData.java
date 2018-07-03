package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class PaymentData {
	Long cardNumber;
	String ifscCode;
	String cardName;

	public void setCardNumber(Long cardNumber) {
		this.cardNumber = cardNumber;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

}
