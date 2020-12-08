package com.ssafy.happyhouse.model.service;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xml.sax.SAXException;

import com.ssafy.happyhouse.api.ApiExplorer;
import com.ssafy.happyhouse.api.AptDealSAXHandler;
import com.ssafy.happyhouse.api.AptRentSAXHandler;
import com.ssafy.happyhouse.api.HouseDealSAXHandler;
import com.ssafy.happyhouse.api.HouseRentSAXHandler;
import com.ssafy.happyhouse.model.HouseCodeDto;
import com.ssafy.happyhouse.model.HouseDealDto;
import com.ssafy.happyhouse.model.repo.HouseMapRepo;

@Service
public class HouseMapServiceImpl implements HouseMapService {

	@Autowired
	HouseMapRepo mapRepo;

	@Override
	public List<HouseCodeDto> getSido() {
		return mapRepo.getSido();
	}

	@Override
	public List<HouseCodeDto> getGugunInSido(String sido) {
		return mapRepo.getGugunInSido(sido);
	}

	@Override
	public List<HouseCodeDto> getDongInGugun(String gugun) {
		return mapRepo.getDongInGugun(gugun);
	}

	@Override
	public List<HouseDealDto> getAptInDong(String dong, String guguncode, boolean apt, boolean house, boolean deal,
			boolean rent, String month) throws IOException, ParserConfigurationException, SAXException {
		SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();

		List<HouseDealDto> deals = new ArrayList<>();
		List<HouseDealDto> dongDeals = new ArrayList<>();
		SAXParser saxParser = saxParserFactory.newSAXParser();
		if (apt) {
			if (rent) {
				String AptRentXML = ApiExplorer.getAptRentXML(guguncode, month);
				AptRentSAXHandler aptRentHandler = new AptRentSAXHandler();
				saxParser.parse(new ByteArrayInputStream(AptRentXML.getBytes()), aptRentHandler);
				deals.addAll(aptRentHandler.getDealList());

			}
			if (deal) {
				String AptDealXML = ApiExplorer.getAptDealXML(guguncode, month);
				AptDealSAXHandler aptDealHandler = new AptDealSAXHandler();
				saxParser.parse(new ByteArrayInputStream(AptDealXML.getBytes()), aptDealHandler);
				deals.addAll(aptDealHandler.getDealList());
			}
		}
		if (house) {
			if (rent) {
				String HouseRentXML = ApiExplorer.getHouseRentXML(guguncode, month);
				HouseRentSAXHandler houseRentHandler = new HouseRentSAXHandler();
				saxParser.parse(new ByteArrayInputStream(HouseRentXML.getBytes()), houseRentHandler);
				deals.addAll(houseRentHandler.getDealList());
			}
			if (rent) {
				String HouseDealXML = ApiExplorer.getHouseDealXML(guguncode, month);
				HouseDealSAXHandler houseDealHandler = new HouseDealSAXHandler();
				saxParser.parse(new ByteArrayInputStream(HouseDealXML.getBytes()), houseDealHandler);
				deals.addAll(houseDealHandler.getDealList());
			}
		}

		if (!dong.equals("")&&!dong.equals("읍/면/동")) {
			for (HouseDealDto d : deals) {
				if (d.getDong().contains(dong))
					dongDeals.add(d);
			}
			return dongDeals;
		}
		return deals;
	}
}