package HRMSBackend.HRMS.Core.Utilities.CompanyValidators;

import org.springframework.stereotype.Service;

import HRMSBackend.HRMS.Entities.concrete.Company;
@Service
public class Com_EmailValidator {
	public boolean IsVerified(Company company) {

		return true;
	}
}
