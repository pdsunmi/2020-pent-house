package com.ssafy.happyhouse.model;

public class HouseCodeDto {

	private String sidocode;
	private String sidoname;
	private String guguncode;
	private String gugunname;
	private String dongname;

	public HouseCodeDto() {
	}

	public String getSidocode() {
		return sidocode;
	}

	public void setSidocode(String sidocode) {
		this.sidocode = sidocode;
	}

	public String getSidoname() {
		return sidoname;
	}

	public void setSidoname(String sidoname) {
		this.sidoname = sidoname;
	}

	public String getGuguncode() {
		return guguncode;
	}

	public void setGuguncode(String guguncode) {
		this.guguncode = guguncode;
	}

	public String getGugunname() {
		return gugunname;
	}

	public void setGugunname(String gugunname) {
		this.gugunname = gugunname;
	}

	public String getDongname() {
		return dongname;
	}

	public void setDongname(String dongname) {
		this.dongname = dongname;
	}

	@Override
	public String toString() {
		return "SidoGugunCodeDto [sidocode=" + sidocode + ", sidoname=" + sidoname + ", guguncode=" + guguncode
				+ ", gugunname=" + gugunname + ", dongname=" + dongname + "]";
	}

}
