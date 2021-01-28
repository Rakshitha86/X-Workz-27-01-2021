package com.xworkz.License.Tester;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

import com.xworkz.License.Constants.BloodGroup;
import com.xworkz.License.Constants.Gender;
import com.xworkz.License.Constants.IDProof;
import com.xworkz.License.Constants.VehicleType;
import com.xworkz.License.DAO.LicenseDAO;
import com.xworkz.License.DAO.LicenseDAOImpl;
import com.xworkz.License.DTO.AddressDTO;
import com.xworkz.License.DTO.CommonDTO;
import com.xworkz.License.DTO.DateOfBirth;
import com.xworkz.License.DTO.LicenseDTO;

public class LicenseTester {

	public static void main(String[] args) {
 AddressDTO addressDTO = new AddressDTO(651,"Jetty",562101,"Chickballapur", "Karnataka", "Sri Venkateshwara Nelaya");
 Date dob=new Date();
 SimpleDateFormat format=new SimpleDateFormat("dd/mm/yyyy");
 try {
	 dob=format.parse("6/3/1999");
 }
 catch(ParseException e) {
	 e.printStackTrace();
 }
LicenseDTO dto = new LicenseDTO("Rakshitha R",21, addressDTO, dob, 9886480431L,BloodGroup.A_POSITIVE,Gender.FEMALE);
dto.setIdProof(IDProof.AADHAR);
dto.setIdProofNo("2345 7645 9876");
dto.setCommercial(false);
dto.setDisability(false);
dto.setStartDate(new Date());//change to future
dto.setVehicleType(VehicleType.TWO_WHEELER);
 
LicenseDAO dao=new LicenseDAOImpl();
dao.save(dto);//DAO
//CRUD----

//LicenseDTO dtoFound = dao.findByIdProofNo("1223 9676 5647");
//System.out.println(dtoFound); //checking with invalid data

LicenseDTO  dtoFound = dao.findByIdProofNo("2345 7645 9876");
	System.out.println(dtoFound);
	
//	boolean updated = dao.updateVehicleTypeByIdProofNo("5432 7654 6578", VehicleType.LMV);
//	System.out.println("updated: "+updated);
	
	boolean updated = dao.updateVehicleTypeByIdProofNo("2345 7645 9876", VehicleType.LMV);
	System.out.println("updated: "+updated);
	
	LicenseDTO  dtoAfterUpdate = dao.findByIdProofNo("2345 7645 9876");
	System.out.println(dtoAfterUpdate);
	
	boolean deleteByIdProofNo = dao.deleteByIdProofNo("2345 7645 987");
	System.out.println(deleteByIdProofNo);
	}
}
