package com.xworkz.License.DTO;

import com.xworkz.License.Constants.IDProof;
import com.xworkz.License.Constants.VehicleType;

import java.util.Date;

import com.xworkz.License.Constants.BloodGroup;
import com.xworkz.License.Constants.Gender;

public class LicenseDTO extends CommonDTO {

	private IDProof idProof;
	private String idProofNo;
	private VehicleType vehicleType;
	private Date StartDate;
	private boolean disability;
	private boolean commercial;

	public LicenseDTO(String name, int age, AddressDTO adressDTO, Date dateOfBirth, long mobileNO, BloodGroup boodGroup,
			Gender gender) {
		super(name, age, adressDTO, dateOfBirth, mobileNO, boodGroup, gender);
	}

	@SuppressWarnings("unlikely-arg-type")
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			System.out.println("object is null");
			return false;
		}
		if (obj instanceof LicenseDTO) {
			LicenseDTO casted = (LicenseDTO) obj;
			if (this.idProofNo != null && this.idProofNo.equals(casted.getIdProof()))
				return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "LicenseDTO [idProof=" + idProof + ", idProofNo=" + idProofNo + ", vehicleType=" + vehicleType
				+ ", StartDate=" + StartDate + ", disability=" + disability + ", commercial=" + commercial + "]";
	}

	public IDProof getIdProof() {
		return idProof;
	}

	public void setIdProof(IDProof idProof) {
		this.idProof = idProof;
	}

	public String getIdProofNo() {
		return idProofNo;
	}

	public void setIdProofNo(String idProofNo) {
		this.idProofNo = idProofNo;
	}

	public VehicleType getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}

	public Date getStartDate() {
		return StartDate;
	}

	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}

	public boolean isDisability() {
		return disability;
	}

	public void setDisability(boolean disability) {
		this.disability = disability;
	}

	public boolean isCommercial() {
		return commercial;
	}

	public void setCommercial(boolean commercial) {
		this.commercial = commercial;
	}

	 
}
