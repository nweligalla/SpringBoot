package lk.telco.Telco.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import lk.telco.Telco.model.Student;

public interface StudentRepository extends CrudRepository<Student, String>{
	
	@Query("SELECT s FROM Student s WHERE name =:name")
	public Student getStudentByName(@Param(value="name") String name);
	
	
	@Modifying
	@Query("UPDATE Student SET email=:email WHERE id=:id")
	public void updateStudentMail(@Param(value="email") String email, @Param(value="id") String id);
	
}
