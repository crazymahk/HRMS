package HRMSBackend.HRMS.Entities.concrete;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "job_titles")
public class JobTitle {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int jobId;
	@Column(name = "title")
	private String jobTitle;

	public JobTitle(int jobId, String jobTitle) {

		this.jobId = jobId;
		this.jobTitle = jobTitle;
	}

	public JobTitle() {

	}
}
