package com.ssafy.happyhouse.model.service;

import java.io.IOException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import com.ssafy.happyhouse.model.HouseCodeDto;
import com.ssafy.happyhouse.model.HouseDealDto;

public interface HouseMapService {

	List<HouseCodeDto> getSido();

	List<HouseCodeDto> getGugunInSido(String sido);

	List<HouseCodeDto> getDongInGugun(String gugun);

	List<HouseDealDto> getAptInDong(String dong, String guguncode, boolean apt, boolean house, boolean deal,
			boolean rent, String month) throws IOException, ParserConfigurationException, SAXException;
//
//	HouseDealDto getDeal(String dong, String aptName, boolean apt, boolean house) throws Exception;

}