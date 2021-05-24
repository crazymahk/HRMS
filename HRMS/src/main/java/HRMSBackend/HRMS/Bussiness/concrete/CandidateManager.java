package HRMSBackend.HRMS.Bussiness.concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HRMSBackend.HRMS.Bussiness.abstracts.CandidateService;
import HRMSBackend.HRMS.Core.Utilities.Results.DataResult;
import HRMSBackend.HRMS.Core.Utilities.Results.ErrorDataResult;
import HRMSBackend.HRMS.Core.Utilities.Results.Result;
import HRMSBackend.HRMS.Core.Utilities.Results.SuccessDataResult;
import HRMSBackend.HRMS.Core.Utilities.Validations.DBValidator;
import HRMSBackend.HRMS.Core.Utilities.Validations.EmailValidator;
import HRMSBackend.HRMS.Core.Utilities.Validations.MernisValidator;
import HRMSBackend.HRMS.DataAccess.abstracts.CandidateDao;
import HRMSBackend.HRMS.Entities.concrete.Candidate;
import HRMSBackend.HRMS.Entities.concrete.admins;

@Service
public class CandidateManager implements CandidateService {

	private CandidateDao candidateDao;
	private DBValidator dBValidator;
	private EmailValidator emailValidator;
	private MernisValidator mernisValidator;

	@Autowired
	public CandidateManager(CandidateDao candidateDao,DBValidator dBValidator ,
			EmailValidator emailValidator,MernisValidator mernisValidator) {
		super();
		this.candidateDao = candidateDao;
		this.dBValidator=dBValidator;
		this.emailValidator=emailValidator;
		this.mernisValidator=mernisValidator;
	}

	@Override
	public DataResult<List<Candidate>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Candidate>>(this.candidateDao.findAll());
	}

	@Override
	public Result add(Candidate candidate) {
		// TODO Auto-generated method stub

		if (dBValidator.IsRegistered(candidate) && emailValidator.IsEmailVerified(candidate)
				&& mernisValidator.IsPersonValid(candidate)) {

			this.candidateDao.save(candidate);
			return new SuccessDataResult("Candidade added Successfully");
		} else {
			return new ErrorDataResult("Candidate Cannat added ");
		}

		
	}

}
