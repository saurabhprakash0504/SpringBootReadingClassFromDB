package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component("visaId")
public class VisaInter implements MainInterface{

	@Override
	public void process(PaymentData p) {
		System.out.println("inside visa payment");
		System.out.println("cardName " +p.cardName);
		System.out.println("cardNumber " +p.cardNumber);
		System.out.println("ifscCode  " +p.ifscCode);
	}

}
