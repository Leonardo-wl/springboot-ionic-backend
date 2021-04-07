package com.leonardoalonso.springbootionicbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.leonardoalonso.springbootionicbackend.services.S3Service;

@SpringBootApplication
public class SpringbootIonicBackendApplication implements CommandLineRunner {
	
	@Autowired
	private S3Service s3Service;
	

	public static void main(String[] args) {
		SpringApplication.run(SpringbootIonicBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {	
		s3Service.uploadFile("D:\\Léo\\teste.jpg");
	}	
}
