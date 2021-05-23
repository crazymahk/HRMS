package HRMSBackend.HRMS.DataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import HRMSBackend.HRMS.Entities.concrete.admins;

public interface adminsDao extends JpaRepository<admins, Integer>{

}
