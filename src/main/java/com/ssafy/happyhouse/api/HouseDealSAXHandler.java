package com.ssafy.happyhouse.api;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.ssafy.happyhouse.model.HouseDealDto;

public class HouseDealSAXHandler extends DefaultHandler {

	private List<HouseDealDto> dealList;
	private StringBuilder sb;
	private HouseDealDto deal;
	private boolean flag;

	public HouseDealSAXHandler() {
		dealList = new ArrayList<>();
		sb = null;
		flag = false;
	}

	public void startElement(String uri, String localName, String qName, Attributes attr) throws SAXException {
		if (qName.equals("item")) {
			deal = new HouseDealDto();
			deal.setType("연립다세대 매매");
			flag = true;
		}
		sb = new StringBuilder();
	}

	public void endElement(String uri, String localName, String qName) throws SAXException {
		if (flag) {
			if (qName.equals("건축년도")) {
				deal.setBuildYear(sb.toString());
			} else if (qName.equals("년")) {
				deal.setDealYear(sb.toString());
			} else if (qName.equals("법정동")) {
				deal.setDong(sb.toString().trim());
			} else if (qName.equals("거래금액")) {
				deal.setDealAmount(sb.toString().trim());
			} else if (qName.equals("연립다세대")) {
				deal.setAptName(sb.toString());
			} else if (qName.equals("월")) {
				deal.setDealMonth(sb.toString());
			} else if (qName.equals("일")) {
				deal.setDealDay(sb.toString());
			} else if (qName.equals("전용면적")) {
				deal.setArea(sb.toString());
			} else if (qName.equals("지번")) {
				deal.setJibun(sb.toString());
			} else if (qName.equals("지역코드")) {
				deal.setCode(sb.toString());
			} else if (qName.equals("층")) {
				deal.setFloor(sb.toString());
			} else if (qName.equals("item")) {
				dealList.add(deal);
				flag = false;
			}
		}
	}

	public void characters(char ch[], int start, int length) throws SAXException {
		if (flag)
			sb.append(new String(ch, start, length));
	}

	public List<HouseDealDto> getDealList() {
		return dealList;
	}
}
