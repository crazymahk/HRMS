package HRMSBackend.HRMS.DataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import HRMSBackend.HRMS.Entities.concrete.Company;

public interface CompanyDao extends JpaRepository<Company, Integer>{

}
