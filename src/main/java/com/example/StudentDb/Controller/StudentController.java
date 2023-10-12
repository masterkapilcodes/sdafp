package com.example.StudentDb.Controller;

import com.example.StudentDb.Modals.Student;
import com.example.StudentDb.Repository.StudentRepository;
import com.example.StudentDb.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("/add")
    public ResponseEntity<String> addStudent(@RequestBody Student student){
        return new ResponseEntity<>(studentService.addStudent(student), HttpStatus.CREATED);
    }
    @GetMapping("/get/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable("id") int id){
        return new ResponseEntity<>(studentService.getStudent(id), HttpStatus.FOUND);
    }
//    @DeleteMapping("/delete/{id}")
//    public void deleteStudent(@PathVariable("id") int id){
//        studentService.deleteStudent(id);
//    }
    @PutMapping("/update")
    public ResponseEntity<Student> update(@RequestParam int id, @RequestParam String name){
        return new ResponseEntity<>(studentService.updateStudent(id, name), HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> delete(@RequestParam int id){
        return new ResponseEntity<>(studentService.deleteStudent2(id), HttpStatus.OK);
    }

//    @PutMapping("/updateid")
//    public Student updateid(@RequestParam int id, @RequestParam int newId){
//        return studentService.updateStudent2(id , newId);
//    }
}
