package com.ssafy.happyhouse.controller;

import java.io.IOException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.xml.sax.SAXException;

import com.ssafy.happyhouse.model.HouseCodeDto;
import com.ssafy.happyhouse.model.HouseDealDto;
import com.ssafy.happyhouse.model.service.HouseMapService;

@RestController
@RequestMapping("/map")
public class HouseMapController {

	@Autowired
	private HouseMapService service;

	@GetMapping("/sido")
	public @ResponseBody List<HouseCodeDto> getSido() {
		return service.getSido();
	}

	@GetMapping("/gugun")
	public @ResponseBody List<HouseCodeDto> getGugunInSido(@RequestParam String sido) {
		return service.getGugunInSido(sido);
	}

	@GetMapping("/dong")
	public @ResponseBody List<HouseCodeDto> getDongInGugun(@RequestParam String gugun) {
		return service.getDongInGugun(gugun);
	}

	@GetMapping("/apt")
	public @ResponseBody List<HouseDealDto> getAptInDong(@RequestParam String dong, @RequestParam String gugun,
			@RequestParam boolean apt, @RequestParam boolean house, 
			@RequestParam boolean deal,
			@RequestParam boolean rent, @RequestParam String month)
			throws IOException, ParserConfigurationException, SAXException {
		return service.getAptInDong(dong, gugun, apt, house, deal, rent, month);
	}
}