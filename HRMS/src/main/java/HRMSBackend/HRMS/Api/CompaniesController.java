package HRMSBackend.HRMS.Api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import HRMSBackend.HRMS.Bussiness.abstracts.CompanyService;
import HRMSBackend.HRMS.Bussiness.abstracts.adminService;
import HRMSBackend.HRMS.Core.Utilities.Results.DataResult;
import HRMSBackend.HRMS.Core.Utilities.Results.Result;
import HRMSBackend.HRMS.Entities.concrete.Company;
import HRMSBackend.HRMS.Entities.concrete.admins;
@RestController
@RequestMapping("/api/companies")
public class CompaniesController {
	private CompanyService companyService;
	@Autowired
	public CompaniesController(CompanyService companyService) {
		super();
		this.companyService = companyService;
	}
	
	

	@GetMapping("/getall")
	public DataResult<List<Company>> getAll() {

		return this.companyService.getAll();
	}
@PostMapping("/add")
	public Result add(@RequestBody Company company) {
		return this.companyService.add(company);
	}
}
