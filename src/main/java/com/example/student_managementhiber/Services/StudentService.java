package com.example.student_managementhiber.Services;

import com.example.student_managementhiber.Entity.Department;
import com.example.student_managementhiber.Entity.Student;
import com.example.student_managementhiber.Repository.DepartmentRepository;
import com.example.student_managementhiber.Repository.StudentRepository;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class StudentService {
    private final StudentRepository studentRepository;
    private final DepartmentRepository departmentRepository;

    public StudentService(StudentRepository studentRepository,DepartmentRepository departmentRepository){
        this.studentRepository = studentRepository;
        this.departmentRepository = departmentRepository;
    }

    public Student createStudent(Student student ,Long department_id){
        Department department = departmentRepository.findById(department_id)
                .orElseThrow(() ->
            new RuntimeException("Department not found"));
        student.setDepartment(department);
        return studentRepository.save(student);
    }
public List<Student> createStudents(List<Student> students,Long department_id){
        return studentRepository.saveAll(students);

}
    public List<Student> getAll(){
        return studentRepository.findAll();
    }
    public Student getStudent(long id){
        return studentRepository.findById(id)
                .orElseThrow(() ->
                new RuntimeException("Id not found "));
    }


}
