package HRMSBackend.HRMS.Core.Utilities.CompanyValidators;

import org.springframework.stereotype.Service;

import HRMSBackend.HRMS.Entities.concrete.Company;

@Service
public class RealCompanyValidator {
	public boolean IsReal(Company company) {

		return true;
	}
}
