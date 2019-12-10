package jc.gmd.ws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;



@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = { 
		"jc"
		})
@EnableScheduling
@EnableAsync
public class WSApplication {

	public static void main(String[] args) {
		SpringApplication.run(WSApplication.class, args);
	}	
}

