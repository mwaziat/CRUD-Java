package com.scaleup.java003;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Java003Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Java003Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(">>>> Java003 - Batch 3");
		// implementasi MVC
		// fokus di model dan controller
		// controller - berinteraksi dengan frontend
		// service - menghubungkan controller dengan model (bisa ada validasi disini)
		// model - berisi table-table / object table
	}
}
