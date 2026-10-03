package com.example.student_managementhiber.Services;

import com.example.student_managementhiber.Entity.Department;
import com.example.student_managementhiber.Repository.DepartmentRepository;
import org.springframework.stereotype.Service;

import java.util.*;
@Service
public class DepartmentServices {
    private  final DepartmentRepository departmentRepository;

    public DepartmentServices(DepartmentRepository departmentRepository){
        this.departmentRepository = departmentRepository;
    }

    public Department createDepartement(Department department){
        return departmentRepository.save(department);
    }

    public List<Department> createDepartments(List<Department> departments){
        return departmentRepository.saveAll(departments);
    }
    public List<Department> getAllDepartment(){
        return departmentRepository.findAll();
    }
    public void deleteDartment(long id){
        departmentRepository.deleteById(id);
    }
    public void deleteDepartments(){
        departmentRepository.deleteAll();
    }

}
