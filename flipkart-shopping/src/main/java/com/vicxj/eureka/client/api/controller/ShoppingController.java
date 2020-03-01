package com.vicxj.eureka.client.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ShoppingController {

	@Autowired
	private RestTemplate template;

	@GetMapping("/flipkart-payment/{price}")
	public String invokePaymentService(@PathVariable int price) {

		/* String url ="http://localhost:9091/payment-provider/paynow/"+price; */

		String url = "http://PAYMENT-SERVICE/payment-provider/paynow/" + price;

		return template.getForObject(url, String.class);
	}
}
