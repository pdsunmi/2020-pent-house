package com.ssafy.happyhouse.model.repo;

import java.util.List;

import com.ssafy.happyhouse.model.HouseCodeDto;

public interface HouseMapRepo {

	List<HouseCodeDto> getSido();

	List<HouseCodeDto> getGugunInSido(String sido);

	List<HouseCodeDto> getDongInGugun(String gugun);

}