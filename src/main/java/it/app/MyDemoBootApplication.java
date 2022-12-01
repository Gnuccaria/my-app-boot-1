package it.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import it.app.service.DipendenteService;
import it.app.service.impl.DipendenteServiceImpl;
//webSocket magichine
//https://www.youtube.com/watch?v=4Hyv4M1kFeM


@EnableJpaRepositories(basePackages="it.app.repository")
@SpringBootApplication
public class MyDemoBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyDemoBootApplication.class, args);
	}

@Bean
public DipendenteService getDipendenteService() {
	return new DipendenteServiceImpl();
}
	
	
}
