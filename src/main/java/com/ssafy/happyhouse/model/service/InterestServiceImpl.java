package com.ssafy.happyhouse.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.happyhouse.model.InterestDto;
import com.ssafy.happyhouse.model.repo.InterestRepo;

@Service
public class InterestServiceImpl implements InterestService {

	@Autowired
	InterestRepo interestRepo;

	@Override
	public int addInterest(InterestDto interest) {
		return interestRepo.addInterest(interest);
	}

	@Override
	public List<InterestDto> getInterest(String userId) {
		return interestRepo.getInterest(userId);
	}

	@Override
	public int removeInterest(String userId, String code) {
		return interestRepo.removeInterest(userId, code);
	}

}
