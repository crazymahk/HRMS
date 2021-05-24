package HRMSBackend.HRMS.Core.Utilities.CompanyValidators;

import org.springframework.stereotype.Service;

import HRMSBackend.HRMS.Entities.concrete.Company;

@Service
public class AdminValidator {
	public boolean IsAccepted(Company company) {

		return true;
	}
}
