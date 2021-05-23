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
@Table(name = "admins")
public class admins {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "id")
	private int id;
	@Column(name = "username")
	private String username;
	@Column(name = "password")
	private String password;

	public admins(int id, String username, String password) {
		this.id = id;
		this.username = username;
		this.password = password;
	}
	public admins() {
		
	}

}
