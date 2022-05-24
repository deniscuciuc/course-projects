package org.example.LearnSpringBoot;

import org.example.LearnSpringBoot.domain.Journal;
import org.example.LearnSpringBoot.repository.JournalRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.text.ParseException;

@SpringBootApplication
public class LearnSpringBootApplication {

	@Bean
	InitializingBean saveData(JournalRepository repository) throws ParseException {
		return () -> {
			repository.save(new Journal("Get to know Spring Boot", "01/01/2016", "Today I will learn Spring Boot"));
			repository.save(new Journal("Simple Spring Boot Project","01/02/2016", "I will do my first Spring Boot Project"));
			repository.save(new Journal("Spring Boot in the Cloud", "01/02/2017", "Spring Boot using Cloud"));
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(LearnSpringBootApplication.class, args);
	}

}
