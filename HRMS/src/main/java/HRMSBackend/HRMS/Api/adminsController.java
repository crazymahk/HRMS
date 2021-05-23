package HRMSBackend.HRMS.Api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import HRMSBackend.HRMS.Bussiness.abstracts.adminService;
import HRMSBackend.HRMS.Core.Utilities.Results.DataResult;
import HRMSBackend.HRMS.Core.Utilities.Results.Result;
import HRMSBackend.HRMS.Entities.concrete.admins;

@RestController
@RequestMapping("/api/admins")
public class adminsController {
	
	private adminService _adminsService;

	@Autowired
	public adminsController(adminService _adminsService) {
		super();
		this._adminsService = _adminsService;
	}

	@GetMapping("/getall")
	public DataResult<List<admins>> getAll() {

		return this._adminsService.getAll();
	}
@PostMapping("/add")
	public Result add(@RequestBody admins _admin) {
		return this._adminsService.add(_admin);
	}
}
