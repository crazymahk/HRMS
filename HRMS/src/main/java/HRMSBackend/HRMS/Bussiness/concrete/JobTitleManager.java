package HRMSBackend.HRMS.Bussiness.concrete;

import java.util.List;

import org.springframework.stereotype.Service;

import HRMSBackend.HRMS.Bussiness.abstracts.JobTitleService;
import HRMSBackend.HRMS.Entities.concrete.JobTitle;

@Service
public class JobTitleManager implements  JobTitleService{

	@Override
	public List<JobTitle> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
