package com.y2080ad.yellowdog.services.accounts;

import org.springframework.boot.SpringApplication;

public class AccountsServer {
	/**
	 * Run the application using Spring Boot and an embedded servlet engine.
	 * 
	 * @param args
	 *            Program arguments - ignored.
	 */
	public static void main(String[] args) {
		// Tell server to look for routes-server.properties or
		// routes-server.yml
		System.setProperty("spring.config.name", "accounts-server");

		SpringApplication.run(AccountsServer.class, args);
	}
}
