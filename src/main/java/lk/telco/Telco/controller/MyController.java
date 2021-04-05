package lk.telco.Telco.controller;

//import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lk.telco.Telco.model.Student;
import lk.telco.Telco.service.StudentService;

@RestController
public class MyController {
	
	@Autowired
	StudentService studentservice;
	
	@GetMapping("/test")
	public String name() {
		return "Nayana Weligalla";
	}
	
	@GetMapping("/test2")
	public String town() {
		return "Welimada";
	}
	
	@GetMapping("/test3")
	public String country() {
		return "Sri lanka";
	}
	
	@GetMapping("/getAllStudentList")
	public Iterable<Student> getAllStudentList(){
		return studentservice.getAllStudents();
		
	}
	
	@GetMapping("/getstudent/{id}")
	public Student getSpecificStuden(@PathVariable String id) {
		return studentservice.getSpecificStudent(id);
	}
	
	@PostMapping("/addStudent")
	public Student addStudent(@RequestBody Student student){
		return studentservice.addStudent(student);
	}
	
	
	@PutMapping("/updateStudent")
	public Student updateStudent(@RequestBody Student student) {
		return studentservice.updateStudent(student);
	}
	
	@DeleteMapping("/deleteStduent/{id}")
	public void  deleteStudent(@PathVariable String id) {
		 studentservice.deleteStudent(id);
	}
	
	@GetMapping("/getStudentByName/{name}")
	public Student getStudentByName(@PathVariable String name) {
		return studentservice.getStudentByName(name);
	}
	
	@PutMapping("/updateStudentEmail")
	public void updateStudentEmail(@RequestBody Student student) {
		 studentservice.updateStudentEmail(student.getEmail(),student.getId());
	}
	
	
	

}
