package com.example.student_managementhiber.Controller;

import com.example.student_managementhiber.Entity.Student;
import com.example.student_managementhiber.Services.StudentService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @PostMapping
    public  Student createStudent(@RequestBody Student student , @RequestParam long department_id){
        return studentService.createStudent(student,department_id);
    }

    @PostMapping("/bulk")
    public  List<Student> createStudents(@RequestBody List<Student> students,@RequestParam long department_id){
        return studentService.createStudents(students,department_id);
    }

    @GetMapping
    public List<Student> getAll(){
        return studentService.getAll();
    }
    @GetMapping("/{id}")
    public Student getStudent(@PathVariable long id){
        return studentService.getStudent(id);

    }

}
