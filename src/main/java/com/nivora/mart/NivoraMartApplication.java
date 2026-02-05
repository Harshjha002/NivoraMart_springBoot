package com.nivora.mart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.cdimascio.dotenv.Dotenv;
import io.github.cdimascio.dotenv.DotenvEntry;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class NivoraMartApplication {

	public static void main(String[] args) {
		System.out.println("running project");
		Dotenv dotenv = Dotenv.configure().load();
		dotenv.entries().forEach( (DotenvEntry entry) -> System.setProperty(entry.getKey(), entry.getValue()));

		SpringApplication.run(NivoraMartApplication.class, args);
	}

}
