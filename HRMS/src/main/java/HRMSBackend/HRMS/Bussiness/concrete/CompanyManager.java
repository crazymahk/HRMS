package HRMSBackend.HRMS.Bussiness.concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HRMSBackend.HRMS.Bussiness.abstracts.CompanyService;
import HRMSBackend.HRMS.Core.Utilities.CompanyValidators.AdminValidator;
import HRMSBackend.HRMS.Core.Utilities.CompanyValidators.Com_EmailValidator;
import HRMSBackend.HRMS.Core.Utilities.CompanyValidators.RealCompanyValidator;
import HRMSBackend.HRMS.Core.Utilities.CompanyValidators.Com_DBValidator;
import HRMSBackend.HRMS.Core.Utilities.Results.DataResult;
import HRMSBackend.HRMS.Core.Utilities.Results.ErrorDataResult;
import HRMSBackend.HRMS.Core.Utilities.Results.Result;
import HRMSBackend.HRMS.Core.Utilities.Results.SuccessDataResult;
import HRMSBackend.HRMS.DataAccess.abstracts.CompanyDao;
import HRMSBackend.HRMS.Entities.concrete.Company;
import HRMSBackend.HRMS.Entities.concrete.admins;

@Service
public class CompanyManager implements CompanyService {

	private CompanyDao companyDao;
	private Com_DBValidator dBValidator;
	private AdminValidator adminValidator;
	private Com_EmailValidator emailValiator;
	private RealCompanyValidator realCompanyValidator;

	@Autowired
	public CompanyManager(CompanyDao companyDao, Com_DBValidator dBValidator, AdminValidator adminValidator,
			Com_EmailValidator emailValiator, RealCompanyValidator realCompanyValidator) {
		super();
		this.companyDao = companyDao;
		this.dBValidator = dBValidator;
		this.adminValidator = adminValidator;
		this.emailValiator = emailValiator;
		this.realCompanyValidator = realCompanyValidator;
	}

	@Override
	public DataResult<List<Company>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Company>>(this.companyDao.findAll());
	}

	@Override
	public Result add(Company company) {
		// TODO Auto-generated method stub

		if (dBValidator.IsRegistered(company) && adminValidator.IsAccepted(company) && emailValiator.IsVerified(company)
				&& realCompanyValidator.IsReal(company)) {
			this.companyDao.save(company);
			return new SuccessDataResult("Ürün eklendi");
		} else {

			if (!dBValidator.IsRegistered(company)) {
				return new ErrorDataResult("Reason : same company in db");
			} else if (!adminValidator.IsAccepted(company)) {

				return new ErrorDataResult("Reason : company not accepted");
			}
			else if (!emailValiator.IsVerified(company)) {

				return new ErrorDataResult("Reason : no mail verrified");
			}

			return new ErrorDataResult("Reason : no real company");
		}

	}

}
