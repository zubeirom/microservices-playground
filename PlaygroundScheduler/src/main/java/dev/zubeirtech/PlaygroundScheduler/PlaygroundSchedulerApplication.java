package dev.zubeirtech.PlaygroundScheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class PlaygroundSchedulerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlaygroundSchedulerApplication.class, args);
	}

}
