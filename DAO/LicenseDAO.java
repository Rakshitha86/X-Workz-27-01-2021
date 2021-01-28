package com.xworkz.License.DAO;

import com.xworkz.License.Constants.VehicleType;
import com.xworkz.License.DTO.LicenseDTO;

public interface LicenseDAO {
	public void save(LicenseDTO dto);
	LicenseDTO findByIdProofNo(String IdProofNo);
	boolean updateVehicleTypeByIdProofNo(String idProof,VehicleType type);
	boolean deleteByIdProofNo(String idProof);
}
