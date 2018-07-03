package com.example.demo;

import org.springframework.stereotype.Component;

@Component("masteroid")
public class MasteroInter implements MainInterface{

	@Override
	public void process(PaymentData p) {
		System.out.println("inside mastero payment");
		System.out.println("cardName " + p.cardName);
		System.out.println("cardNumber " + p.cardNumber);
		System.out.println("ifscCode  " + p.ifscCode);
	}

}
