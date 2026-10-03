package com.example.student_managementhiber.Services;

import com.example.student_managementhiber.Entity.Course;
import com.example.student_managementhiber.Repository.CourseRepository;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class CourseServices {
    private final CourseRepository courseRepository;

    public CourseServices(CourseRepository courseRepository){
        this.courseRepository = courseRepository;
    }

    public Course CreateCourse(Course course){
        return courseRepository.save(course);
    }

    public List<Course> getAllCourse(){
        return  courseRepository.findAll();
    }
    public Course getCourse(long id){
        return courseRepository.findById(id)
                .orElseThrow(()->
                        new RuntimeException(("course id not found")));
    }
}
