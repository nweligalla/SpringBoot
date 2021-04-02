package lk.telco.Telco.repository;

import org.springframework.data.repository.CrudRepository;

import lk.telco.Telco.model.Student;

public interface StudentRepository extends CrudRepository<Student, String>{
	
}
