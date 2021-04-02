package lk.telco.Telco.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Student {
	
	@Id
	private String id;
	@Column(name="name")
	private String name;
	@Column(name="email")
	private String email;
	
	

}
