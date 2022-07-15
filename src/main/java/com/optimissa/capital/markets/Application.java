package com.optimissa.capital.markets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import com.optimissa.entities.Currency;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		RestTemplate template = new RestTemplate();
		String jsonString = "https://api.frankfurter.app/latest?to=USD";
		
		Currency currency = template.getForObject(jsonString, Currency.class);
		
		System.out.println("Amount: " + currency.getAmount());
		System.out.println("Base: " + currency.getBase());
		System.out.println("Date: " + currency.getDate());
		System.out.println("Rate: " + currency.getRates());
		
	}

}
