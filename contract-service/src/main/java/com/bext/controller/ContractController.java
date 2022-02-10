package com.bext.controller;

import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bext.dto.Contract;

@RestController
@RequestMapping(ContractController.CONTRACT_BASE_URI)
public class ContractController {
	
	public static final String CONTRACT_BASE_URI = "/v1/contracts";
	
	@RequestMapping(value = "{contractNumber}")
	public Contract getContract(@PathVariable final int contractNumber) {
		Contract contract = new Contract();
		contract.setName("Alberto");
		contract.setId(contractNumber);
		return contract;
	}
	
	@RequestMapping(value="/test", method = RequestMethod.GET)
	@ResponseBody
	public String test() {
		return "Responding ok.";
	}

}
