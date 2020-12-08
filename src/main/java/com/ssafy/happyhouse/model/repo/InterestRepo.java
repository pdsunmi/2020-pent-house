package com.ssafy.happyhouse.model.repo;

import java.util.List;

import com.ssafy.happyhouse.model.InterestDto;

public interface InterestRepo {

	int addInterest(InterestDto interest);

	List<InterestDto> getInterest(String userId);

	int removeInterest(String userId, String code);

}