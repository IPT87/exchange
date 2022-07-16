package com.optimissa.capital.markets;

import java.text.SimpleDateFormat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import com.optimissa.entities.Movement;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		RestTemplate template = new RestTemplate();
		String jsonString = "https://api.frankfurter.app/latest?to=USD";
		
		Movement currency = template.getForObject(jsonString, Movement.class);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Amount: " + currency.getAmount());
		System.out.println("Base: " + currency.getBase());
		System.out.println("Date: " + sdf.format(currency.getDate()));
		System.out.println("Rate: " + currency.getRates().get("USD"));
		
	}

}
