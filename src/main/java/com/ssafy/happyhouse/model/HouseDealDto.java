package com.ssafy.happyhouse.model;

public class HouseDealDto {
	/** 법정 동명 */
	private String dong;
	/** 아파트 이름 */
	private String aptName;
	/** 법정 동코드 */
	private String code;
	/** 건축 연도 */
	private String buildYear;
	/** 거래 연도 */
	private String dealYear;
	/** 거래 월 */
	private String dealMonth;
	/** 거래 일 */
	private String dealDay;
	/** 전용면적 */
	private String area;
	/** 층 */
	private String floor;
	/** 지번 */
	private String jibun;
	/** 전월세 : 월세금액 */
	private String rentMoney;
	/** 전월세 : 보증금 */
	private String deposit;
	/** 매매 : 거래 금액 */
	private String dealAmount;

	private String type;

	public HouseDealDto() {
	}

	public String getDong() {
		return dong;
	}

	public void setDong(String dong) {
		this.dong = dong;
	}

	public String getAptName() {
		return aptName;
	}

	public void setAptName(String aptName) {
		this.aptName = aptName;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getBuildYear() {
		return buildYear;
	}

	public void setBuildYear(String buildYear) {
		this.buildYear = buildYear;
	}

	public String getDealYear() {
		return dealYear;
	}

	public void setDealYear(String dealYear) {
		this.dealYear = dealYear;
	}

	public String getDealMonth() {
		return dealMonth;
	}

	public void setDealMonth(String dealMonth) {
		this.dealMonth = dealMonth;
	}

	public String getDealDay() {
		return dealDay;
	}

	public void setDealDay(String dealDay) {
		this.dealDay = dealDay;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public String getJibun() {
		return jibun;
	}

	public void setJibun(String jibun) {
		this.jibun = jibun;
	}

	public String getRentMoney() {
		return rentMoney;
	}

	public void setRentMoney(String rentMoney) {
		this.rentMoney = rentMoney;
	}

	public String getDeposit() {
		return deposit;
	}

	public void setDeposit(String deposit) {
		this.deposit = deposit;
	}

	public String getDealAmount() {
		return dealAmount;
	}

	public void setDealAmount(String dealAmount) {
		this.dealAmount = dealAmount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "HouseDeal [dong=" + dong + ", aptName=" + aptName + ", code=" + code + ", buildYear=" + buildYear
				+ ", dealYear=" + dealYear + ", dealMonth=" + dealMonth + ", dealDay=" + dealDay + ", area=" + area
				+ ", floor=" + floor + ", jibun=" + jibun + ", rentMoney=" + rentMoney + ", deposit=" + deposit
				+ ", dealAmount=" + dealAmount + ", type=" + type + "]";
	}

}
