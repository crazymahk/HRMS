package HRMSBackend.HRMS.Bussiness.abstracts;

import java.util.List;

import HRMSBackend.HRMS.Core.Utilities.Results.DataResult;
import HRMSBackend.HRMS.Core.Utilities.Results.Result;
import HRMSBackend.HRMS.Entities.concrete.Company;
import HRMSBackend.HRMS.Entities.concrete.admins;

public interface CompanyService {
	DataResult<List<Company>> getAll();

	public Result add(Company company);
}
