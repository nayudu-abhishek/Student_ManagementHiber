package com.example.student_managementhiber.Repository;

import com.example.student_managementhiber.Entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
