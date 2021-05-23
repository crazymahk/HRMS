package HRMSBackend.HRMS.DataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import HRMSBackend.HRMS.Entities.concrete.Candidate;

public interface CandidateDao extends JpaRepository<Candidate, Integer>{

}
