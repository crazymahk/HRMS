package HRMSBackend.HRMS.Bussiness.abstracts;

import java.util.List;

import HRMSBackend.HRMS.Entities.concrete.JobTitle;

public interface JobTitleService {
	
	public List<JobTitle> getAll();

}
