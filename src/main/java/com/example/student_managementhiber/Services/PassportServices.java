package com.example.student_managementhiber.Services;

import com.example.student_managementhiber.Entity.Passport;
import com.example.student_managementhiber.Entity.Student;
import com.example.student_managementhiber.Repository.DepartmentRepository;
import com.example.student_managementhiber.Repository.PassportRepository;
import com.example.student_managementhiber.Repository.StudentRepository;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class PassportServices {
    private final PassportRepository passportRepository;


    public PassportServices(PassportRepository passportRepository) {
        this.passportRepository = passportRepository;
    }

    public Passport createPassport(Passport passport) {
        return passportRepository.save(passport);
    }

    public List<Passport> getAllpassports() {
        return passportRepository.findAll();
    }

    public Passport getPassport(Long id) {
        return passportRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("passport not found"));
    }

}
