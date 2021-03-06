package com.read.xml;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableBatchProcessing
public class ReadXmlApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReadXmlApplication.class, args);
	}

}
