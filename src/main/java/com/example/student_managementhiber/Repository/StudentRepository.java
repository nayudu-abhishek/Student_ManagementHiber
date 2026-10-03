package com.example.student_managementhiber.Repository;

import com.example.student_managementhiber.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
