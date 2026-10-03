package com.example.student_managementhiber.Controller;

import com.example.student_managementhiber.Entity.Department;
import com.example.student_managementhiber.Services.DepartmentServices;
import org.springframework.web.bind.annotation.*;

import java.util.*;
@RestController
@RequestMapping("/departments")
public class DepartmentController {
    private final DepartmentServices departmentServices;
    public DepartmentController(DepartmentServices departmentServices){
        this.departmentServices = departmentServices;
    }
    @PostMapping
    public Department createDepartment(@RequestBody Department department){
        return departmentServices.createDepartement(department);
    }
    @PostMapping("/bulk")
    public List<Department> createDepartments(@RequestBody List<Department> departments){
        return departmentServices.createDepartments(departments);
    }
    @GetMapping
    public List<Department> getAllDepartment(){
        return departmentServices.getAllDepartment();
    }
    @DeleteMapping("/{id}")
    public String deleteDepartment(@PathVariable Long id){
        departmentServices.deleteDartment(id);
        return  "successfully deleted done!";
    }
    @DeleteMapping
    public String deleteDepartments(){
        departmentServices.deleteDepartments();
        return "Successfully  deleted";
    }

}
