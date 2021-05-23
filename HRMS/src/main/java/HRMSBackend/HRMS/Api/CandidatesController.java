package HRMSBackend.HRMS.Api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import HRMSBackend.HRMS.Bussiness.abstracts.CandidateService;
import HRMSBackend.HRMS.Core.Utilities.Results.DataResult;
import HRMSBackend.HRMS.Entities.concrete.Candidate;
import HRMSBackend.HRMS.Entities.concrete.admins;

@RestController
@RequestMapping("/api/candidates")
public class CandidatesController {

	private CandidateService candidateService;

	public CandidatesController(CandidateService candidateService) {
		super();
		this.candidateService = candidateService;
	}

	@GetMapping("/getall")
	public DataResult<List<Candidate>> getAll() {

		return this.candidateService.getAll();
	}

}
