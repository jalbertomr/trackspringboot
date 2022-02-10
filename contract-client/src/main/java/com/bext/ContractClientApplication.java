package com.bext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bext.client.ContractClient;
import com.bext.dto.Contract;

@SpringBootApplication
public class ContractClientApplication implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(ContractClientApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(ContractClientApplication.class, args);
	}

	@Autowired
	private ContractClient contractClient;
	
	@Override
	public void run(String... args) throws Exception {
		Contract contract = contractClient.getContract(1);
		logger.info("Response: {}", contract);
	}
}
