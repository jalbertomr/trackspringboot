package com.bext.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestOperations;

import com.bext.dto.Contract;

@Component
public class ContractClient {
	private final String url;

	@Autowired
	public RestOperations restOperations;
	
	
	@Autowired
	public ContractClient(@Value("${contract.service.url}") final String url) {
		super();
		this.url = url;
	}

	public Contract getContract(final int contractNumber) {
		return restOperations.getForObject(url, Contract.class, contractNumber);
	}
}
