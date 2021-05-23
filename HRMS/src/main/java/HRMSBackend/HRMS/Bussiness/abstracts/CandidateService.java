package HRMSBackend.HRMS.Bussiness.abstracts;

import java.util.List;

import HRMSBackend.HRMS.Core.Utilities.Results.DataResult;
import HRMSBackend.HRMS.Core.Utilities.Results.Result;
import HRMSBackend.HRMS.Entities.concrete.Candidate;
import HRMSBackend.HRMS.Entities.concrete.admins;

public interface CandidateService {
	DataResult<List<Candidate>> getAll();

	public Result add(Candidate candidate);

}
