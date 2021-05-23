package HRMSBackend.HRMS.Bussiness.concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HRMSBackend.HRMS.Bussiness.abstracts.CandidateService;
import HRMSBackend.HRMS.Core.Utilities.Results.DataResult;
import HRMSBackend.HRMS.Core.Utilities.Results.Result;
import HRMSBackend.HRMS.Core.Utilities.Results.SuccessDataResult;
import HRMSBackend.HRMS.DataAccess.abstracts.CandidateDao;
import HRMSBackend.HRMS.Entities.concrete.Candidate;
import HRMSBackend.HRMS.Entities.concrete.admins;
@Service
public class CandidateManager implements CandidateService {

	private CandidateDao candidateDao;
	
	@Autowired
	public CandidateManager(CandidateDao candidateDao) {
		super();
		this.candidateDao = candidateDao;
	}

	@Override
	public DataResult<List<Candidate>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Candidate>>(this.candidateDao.findAll());
	}

	@Override
	public Result add(Candidate candidate) {
		// TODO Auto-generated method stub
		this.candidateDao.save(candidate);
		System.out.println("Kişi eklndi");
		return new SuccessDataResult("Ürün eklendi");
	}

}
