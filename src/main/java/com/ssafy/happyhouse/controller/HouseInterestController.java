package com.ssafy.happyhouse.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.happyhouse.model.InterestDto;
import com.ssafy.happyhouse.model.service.InterestService;

@RestController
@RequestMapping("/interest")
public class HouseInterestController {

	@Autowired
	private InterestService service;

	@PostMapping
	public int addInterest(@RequestBody InterestDto interest) {
		return service.addInterest(interest);
	}

	@GetMapping
	public @ResponseBody List<InterestDto> getInterest(@RequestParam String userId) {
		return service.getInterest(userId);
	}

	@DeleteMapping
	public int removeInterest(@RequestParam String userId, @RequestParam String code) {
		return service.removeInterest(userId, code);
	}

	@ExceptionHandler(SQLException.class)
	public int databaseError() {
		return 0;
	}
}