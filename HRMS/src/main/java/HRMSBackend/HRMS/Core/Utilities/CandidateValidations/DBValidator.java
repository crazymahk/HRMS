package HRMSBackend.HRMS.Core.Utilities.CandidateValidations;

import org.springframework.stereotype.Service;

import HRMSBackend.HRMS.Entities.concrete.Candidate;
@Service
public class DBValidator {
	public boolean IsRegistered(Candidate candidates) {

		return true;

	}
}
