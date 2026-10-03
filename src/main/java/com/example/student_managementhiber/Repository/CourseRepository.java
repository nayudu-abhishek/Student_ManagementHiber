package com.example.student_managementhiber.Repository;

import com.example.student_managementhiber.Entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course , Long> {
}
