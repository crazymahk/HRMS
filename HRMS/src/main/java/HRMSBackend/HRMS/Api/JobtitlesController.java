package HRMSBackend.HRMS.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import HRMSBackend.HRMS.Bussiness.abstracts.JobTitleService;
import HRMSBackend.HRMS.Entities.concrete.JobTitle;

import java.util.List;

@RestController
@RequestMapping("/api/job_titles")
public class JobtitlesController {

	private JobTitleService jobTitleService;

	@Autowired
	public JobtitlesController(JobTitleService jobTitleService) {
		super();
		this.jobTitleService = jobTitleService;
	}

	@GetMapping("/getall")
	public List<JobTitle> getAll() {

		return this.jobTitleService.getAll();
	}
}
