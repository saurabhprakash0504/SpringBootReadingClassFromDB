package com.example.demo;

import org.springframework.stereotype.Component;

@Component("masterId")
public class MasterInter implements MainInterface {

	public MasterInter() {
		System.out.println("Object initialized");
	}
	
	@Override
	public void process(PaymentData p) {

		System.out.println("inside master payment");
		System.out.println("cardName " +p.cardName);
		System.out.println("cardNumber " +p.cardNumber);
		System.out.println("ifscCode  " +p.ifscCode);
	
	}

}
