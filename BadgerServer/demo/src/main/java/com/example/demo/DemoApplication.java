package com.example.demo;

import java.beans.BeanProperty;
import java.beans.Transient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	@Transactional
	public CommandLineRunner demo(clientRepo repository) {
		return (args) ->

	private void inserJavaAdvocates(clientRepo repository) {
		repository.save(new client("Badger", "Badger", "badger@gmail.com", "123456789"));
		repository.save(new client("King", "King", "king@gmail.com", "648215735"));
		repository.save(new client("Queen", "Queen", "queen@gmail.com", "987854612"));
		repository.save(new client("Prince", "Prince", "prince@gmail.copm", "951753248"));
	}
}
