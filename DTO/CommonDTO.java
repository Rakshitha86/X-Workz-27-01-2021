package com.xworkz.License.DTO;

import java.util.Date;

import com.xworkz.License.Constants.BloodGroup;
import com.xworkz.License.Constants.Gender;

public class CommonDTO {
	private String name;
	private int age;
	private AddressDTO adressDTO;
//private DateOfBirth DOB;
	private Date dateOfBirth;
	private long mobileNO;
	private BloodGroup boodGroup;
	private Gender gender;

	public CommonDTO(String name, int age, AddressDTO adressDTO, Date dateOfBirth, long mobileNO, BloodGroup boodGroup,
			Gender gender) {
		super();
		this.name = name;
		this.age = age;
		this.adressDTO = adressDTO;
		this.dateOfBirth = dateOfBirth;
		this.mobileNO = mobileNO;
		this.boodGroup = boodGroup;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public AddressDTO getAdressDTO() {
		return adressDTO;
	}

	public void setAdressDTO(AddressDTO adressDTO) {
		this.adressDTO = adressDTO;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public long getMobileNO() {
		return mobileNO;
	}

	public void setMobileNO(long mobileNO) {
		this.mobileNO = mobileNO;
	}

	public BloodGroup getBoodGroup() {
		return boodGroup;
	}

	public void setBoodGroup(BloodGroup boodGroup) {
		this.boodGroup = boodGroup;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

}
