package HRMSBackend.HRMS.Bussiness.abstracts;

import java.util.List;

import HRMSBackend.HRMS.Core.Utilities.Results.DataResult;
import HRMSBackend.HRMS.Core.Utilities.Results.Result;
import HRMSBackend.HRMS.Entities.concrete.admins;

public interface adminService {
	DataResult<List<admins>> getAll();

	Result add(admins _admin) ;
}
