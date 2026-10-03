package com.example.student_managementhiber.Controller;

import com.example.student_managementhiber.Entity.Course;
import com.example.student_managementhiber.Services.CourseServices;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/courses")
public class CourseController {

    private final CourseServices courseServices;

    public CourseController(CourseServices courseServices){
        this.courseServices = courseServices;
    }
    @PostMapping
    public Course createCourse(@RequestBody Course course){
        return courseServices.CreateCourse(course);
    }
    @GetMapping
    public List<Course> getAllCourses(){
        return courseServices.getAllCourse();
    }
    @GetMapping("/{id}")
    public Course getId(@PathVariable Long id){
        return courseServices.getCourse(id);
    }


}
