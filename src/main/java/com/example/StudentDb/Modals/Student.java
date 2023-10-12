package com.example.StudentDb.Modals;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// with the help of lombok and data we do not need to manually write constructors
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private String id;
    @Column(name = "name")
    private String name;
    @Column(name = "contact", unique = true)
    private String contact;
    @OneToOne(mappedBy = "studentVariableName", cascade = CascadeType.ALL)
    private Card card;
     private int jj;
}
