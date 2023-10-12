package com.example.StudentDb.Repository;

import com.example.StudentDb.Modals.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository  // jpa repository has 2 param 1 is lass, second is pk data type
public interface StudentRepository extends JpaRepository<Student, Integer> {

//    void delete(int id);
}
