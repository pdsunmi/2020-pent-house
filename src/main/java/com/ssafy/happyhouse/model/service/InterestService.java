package com.ssafy.happyhouse.model.service;

import java.util.List;

import com.ssafy.happyhouse.model.InterestDto;

public interface InterestService {
	int addInterest(InterestDto interest);

	List<InterestDto> getInterest(String userId);

	int removeInterest(String userId, String code);
}
