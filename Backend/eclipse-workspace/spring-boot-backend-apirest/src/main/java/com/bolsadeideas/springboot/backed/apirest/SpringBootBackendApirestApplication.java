package com.bolsadeideas.springboot.backed.apirest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SpringBootBackendApirestApplication implements CommandLineRunner{

	@Autowired
	private BCryptPasswordEncoder passwordEncodore;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootBackendApirestApplication.class, args);
	}

	public void run(String... args) throws Exception {
		String password= "12345";
		
		for (int i = 0; i < 4; i++) {
			String passwordBcrypt = passwordEncodore.encode(password);
			System.out.println(passwordBcrypt);
		}
	}

}
