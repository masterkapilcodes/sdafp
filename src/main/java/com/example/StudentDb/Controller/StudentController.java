package com.example.StudentDb.Controller;

import com.example.StudentDb.Modals.Student;
import com.example.StudentDb.Repository.StudentRepository;
import com.example.StudentDb.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("/add")
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }
    @GetMapping("/get/{id}")
    public Student getStudent(@PathVariable("id") int id){
        return studentService.getStudent(id);
    }
//    @DeleteMapping("/delete/{id}")
//    public void deleteStudent(@PathVariable("id") int id){
//        studentService.deleteStudent(id);
//    }
    @PutMapping("/update")
    public Student update(@RequestParam int id, @RequestParam String name){
        return studentService.updateStudent(id, name);
    }

    @DeleteMapping("/delete")
    public String delete(@RequestParam int id){
        return studentService.deleteStudent2(id);
    }

//    @PutMapping("/updateid")
//    public Student updateid(@RequestParam int id, @RequestParam int newId){
//        return studentService.updateStudent2(id , newId);
//    }
}
