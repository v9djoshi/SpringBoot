package com.vicxj.springboot.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vicxj.springboot.vo.Company;

@RestController
public class CompaniesController {

	@RequestMapping("/companies")
	public List<Company> getCompanies() {

		List<Company> companies = Arrays.asList(new Company("Deloitte", 1234, "Hyderabad"),
				new Company("Amazone", 4345345, "NY,USA"), new Company("CGI", 1234354, "Ontario, CN"));

		return companies;
	}
}
