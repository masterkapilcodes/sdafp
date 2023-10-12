package com.example.StudentDb.Services;

import com.example.StudentDb.Modals.Student;
import com.example.StudentDb.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    public Student getStudent(int id) {
        Student student = studentRepository.findById(id).get();
        return student;
    }

//    public void deleteStudent(int id) {
//        studentRepository.deleteById(id);
//    }

    public Student updateStudent(int id, String name) {
        Student student = studentRepository.findById(id).get();
        student.setName(name);
        studentRepository.save(student);
        return student;
    }

    public String deleteStudent2(int id) {
        studentRepository.deleteById(id);
        return "student deleted";
    }

//    public Student updateStudent2(int id, int newId) {
//        Student student = studentRepository.findById(id).get();
//        studentRepository.deleteById(id);
//        student.setId(newId);
//        studentRepository.save(student);
//        return student;
//    }
}
