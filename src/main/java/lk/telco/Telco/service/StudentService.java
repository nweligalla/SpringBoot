package lk.telco.Telco.service;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import java.util.stream.*;

import lk.telco.Telco.model.Student;
import lk.telco.Telco.repository.StudentRepository;


@Service
public class StudentService {
	
	
	
	@Autowired
	StudentRepository studentRepository;
	
	public StudentService()
	{
	
	}
	
	
	public Iterable<Student> getAllStudents() {
		return studentRepository.findAll();
		
	}
	
	public Student getSpecificStudent(String id) {
//		return studentList.stream().filter(st->st.getId().equals(id)).findFirst().get();
		
		return studentRepository.findById(id).get();
	}
	
	
	public Student addStudent(Student student){
		
		//return Stream.of(student).collect(Collectors.toCollection(()->studentList));
		
		return studentRepository.save(student);
		
		
		
	}
	
	
	public Student updateStudent(Student student) {
//		try {
//			for (Student st: studentList) {
//				if(st.getId().equals(student.getId())) {
//					st.setEmail(student.getEmail());
//					st.setName(student.getName());
//				}
//			}
//			
//			return "Successfully updated";
//		}
//		catch (Exception e) {
//			return "Error";
//		}
		
		
		return studentRepository.save(student);
	}
	
	public void deleteStudent(String id) {
		
//		for(Student st :studentList) {
//			if(st.getId().equals(id)) {
//				studentList.remove(st);
//				return "Successfully deleted"+id;
//			}
//		}
//		
//		return "Not found";
		
		studentRepository.deleteById(id);
	}
	
	
	public Student getStudentByName(String name) {
		
		return studentRepository.getStudentByName(name);
	}
	
	
	@Transactional
	public void updateStudentEmail(String email,String id) {
		 studentRepository.updateStudentMail(email, id);
	}
	
		
		
	 
	
	
	
	

}
