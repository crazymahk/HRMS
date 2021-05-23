package HRMSBackend.HRMS.Bussiness.concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import HRMSBackend.HRMS.Bussiness.abstracts.adminService;
import HRMSBackend.HRMS.Core.Utilities.Results.DataResult;
import HRMSBackend.HRMS.Core.Utilities.Results.Result;
import HRMSBackend.HRMS.Core.Utilities.Results.SuccessDataResult;
import HRMSBackend.HRMS.Core.Utilities.Results.SuccessResult;
import HRMSBackend.HRMS.DataAccess.abstracts.adminsDao;
import HRMSBackend.HRMS.Entities.concrete.admins;

@Service
public class adminManager implements adminService {

	private adminsDao _adminsdao;
	@Autowired
	public adminManager(adminsDao _adminsdao) {
		super();
		this._adminsdao = _adminsdao;
	}

	@Override
	public DataResult<List<admins>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<admins>>(this._adminsdao.findAll(),"Data Listelendi");
	}

	@Override
	public Result add(admins _admin) {
		// TODO Auto-generated method stub
		this._adminsdao.save(_admin);
		 return new SuccessDataResult("Ürün eklendi");
				
	}

}
