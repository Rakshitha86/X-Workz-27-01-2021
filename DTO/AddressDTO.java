package com.xworkz.License.DTO;

public class AddressDTO {
	private int doorNo;
	private String area;
	private int pinCode;
	private String district;
	private String state;
	private String buildingName;

	public AddressDTO(int doorNo, String area, int pinCode, String district, String state, String buildingName) {
		super();
		this.doorNo = doorNo;
		this.area = area;
		this.pinCode = pinCode;
		this.district = district;
		this.state = state;
		this.buildingName = buildingName;
	}

	public int getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

}
