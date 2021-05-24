package HRMSBackend.HRMS.Bussiness.concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HRMSBackend.HRMS.Bussiness.abstracts.CompanyService;
import HRMSBackend.HRMS.Core.Utilities.Results.DataResult;
import HRMSBackend.HRMS.Core.Utilities.Results.Result;
import HRMSBackend.HRMS.Core.Utilities.Results.SuccessDataResult;
import HRMSBackend.HRMS.Core.Utilities.Validations.DBValidator;
import HRMSBackend.HRMS.DataAccess.abstracts.CompanyDao;
import HRMSBackend.HRMS.Entities.concrete.Company;
import HRMSBackend.HRMS.Entities.concrete.admins;
@Service
public class CompanyManager implements CompanyService{

	private CompanyDao companyDao;
	private DBValidator dBValidator;
	
	@Autowired
	public CompanyManager(CompanyDao companyDao) {
		super();
		this.companyDao = companyDao;
	}

	@Override
	public DataResult<List<Company>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Company>>(this.companyDao.findAll());
	}

	@Override
	public Result add(Company company) {
		// TODO Auto-generated method stub
		this.companyDao.save(company);
		 return new SuccessDataResult("Ürün eklendi");
	}

}
