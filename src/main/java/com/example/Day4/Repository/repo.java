package com.example.Day4.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Day4.Model.Student;

public interface repo extends JpaRepository<Student,Integer>{

}
