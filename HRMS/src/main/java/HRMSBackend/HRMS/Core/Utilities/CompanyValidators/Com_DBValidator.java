package HRMSBackend.HRMS.Core.Utilities.CompanyValidators;

import org.springframework.stereotype.Service;

import HRMSBackend.HRMS.Entities.concrete.Company;

@Service
public class Com_DBValidator {
	public boolean IsRegistered(Company company) {

		return true;
	}
}
