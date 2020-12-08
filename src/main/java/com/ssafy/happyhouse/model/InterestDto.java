package com.ssafy.happyhouse.model;

public class InterestDto {

	private String sido;
	private String gugun;
	private String dong;
	private String code;
	private String userId;

	public InterestDto() {
		super();
	}

	public InterestDto(String sido, String gugun, String dong, String code, String userId) {
		super();
		this.sido = sido;
		this.gugun = gugun;
		this.dong = dong;
		this.code = code;
		this.userId = userId;
	}

	public String getSido() {
		return sido;
	}

	public void setSido(String sido) {
		this.sido = sido;
	}

	public String getGugun() {
		return gugun;
	}

	public void setGugun(String gugun) {
		this.gugun = gugun;
	}

	public String getDong() {
		return dong;
	}

	public void setDong(String dong) {
		this.dong = dong;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "InterestDto [sido=" + sido + ", gugun=" + gugun + ", dong=" + dong + ", code=" + code + ", userId="
				+ userId + "]";
	}

}
