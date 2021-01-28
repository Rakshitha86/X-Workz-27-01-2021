package com.xworkz.License.DAO;

import java.util.ArrayList;
import java.util.Iterator;

import com.xworkz.License.Constants.VehicleType;
import com.xworkz.License.DTO.LicenseDTO;

public class LicenseDAOImpl implements LicenseDAO {

	private ArrayList<LicenseDTO> database;

	public LicenseDAOImpl() {
		this.database = new ArrayList<LicenseDTO>();
	}

	@Override
	public void save(LicenseDTO dto) {
		System.out.println("Inviked LicenseDAO ");
		System.out.println("dto to save" + dto);
		boolean saved = this.database.add(dto);
		if (saved)
			System.out.println("dto is saved");
		else
			System.out.println("dto is not saved");
		// or

		// String result = saved ? "dto saved" : "not saved";
		// System.out.println(result);

	}

	@Override
	public LicenseDTO findByIdProofNo(String IdProofNo) {
		System.out.println("Invoked findByIdProofNO");
		System.out.println("idProof:" + IdProofNo);

		LicenseDTO dummy = null;
		for (LicenseDTO licenseDTO : this.database) {
			String idProofFromDTO = licenseDTO.getIdProofNo();
			if (licenseDTO.getIdProofNo().equals(IdProofNo)) {
				System.out.println("License found");
				dummy = licenseDTO;
			}
		}
		return dummy;

		// or

//		for (LicenseDTO licenseDTO : this.database) {
//			String idProofFromDTO = licenseDTO.getIdProofNo();
//			if (idProofFromDTO.equals(IdProofNo)) {
//				System.out.println("License found");
//				return licenseDTO;
//			}
//		}
//		return null;
	}

	@Override
	public boolean updateVehicleTypeByIdProofNo(String idProof, VehicleType type) {
		System.out.println("updateVehicleTypeByIdProofNo");
		System.out.println("idProof: " + idProof);
		System.out.println("type: " + type);
		LicenseDTO dtoFromDB = this.findByIdProofNo(idProof);
		if (dtoFromDB != null) {
			System.out.println("can update,licence is found");
			dtoFromDB.setVehicleType(type);
			return true;
		} else {
			System.out.println("cannot update");
		}
		return false;
	}

	@Override
	public boolean deleteByIdProofNo(String idProof) {
		System.out.println("deleteByIdProofNo");

//LicenseDTO dto=this.findByIdProofNo(idProof);
//if(dto!=null) {
//	this.database.remove(dto);
//}

//or

		Iterator<LicenseDTO> iterator = this.database.iterator();
		while (iterator.hasNext()) {
			LicenseDTO dto = iterator.next();
			if (dto.getIdProofNo().equals(idProof)) {
				iterator.remove();
				break;
			}
		}
		return false;
	}

}
