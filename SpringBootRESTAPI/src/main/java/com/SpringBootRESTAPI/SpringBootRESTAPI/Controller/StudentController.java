package com.SpringBootRESTAPI.SpringBootRESTAPI.Controller;

import com.SpringBootRESTAPI.SpringBootRESTAPI.Bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    //http://localhost:8080/student
@GetMapping("student")
    public Student getStudent(){
            Student student=new Student(1,"Suresh","Rathod");
            return student;
    }

    @GetMapping("getStudent")
    //http://localhost:8080/getStudent
    public List<Student> getStudents(){
        List<Student> students=new ArrayList<>();
        students.add(new Student(1,"suresh","rathod"));
        students.add(new Student(2,"Howard","Roark"));
        students.add(new Student(3,"Domnique","Francon"));
        return students;


    }

    //SpringBoot REST API with PathVariable
    //{id}-URI template variable
    //http://localhost:8080/students/1
@GetMapping("students/{id}")
    public Student studentPathVariable(@PathVariable("id") int StudentId)
    {
        return new Student(StudentId,"Suresh","Rathod");

    }

}
