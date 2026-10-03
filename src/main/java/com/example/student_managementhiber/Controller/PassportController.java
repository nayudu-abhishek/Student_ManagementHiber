package com.example.student_managementhiber.Controller;

import com.example.student_managementhiber.Entity.Passport;
import com.example.student_managementhiber.Entity.Student;
import com.example.student_managementhiber.Services.PassportServices;
import com.example.student_managementhiber.Services.StudentService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/passport")
public class PassportController {
    private final PassportServices passportServices;

    public PassportController(PassportServices passportServices) {
        this.passportServices = passportServices;
    }
    @PostMapping
    public Passport createPassport(@RequestBody Passport passport){
        return passportServices.createPassport(passport);
    }
    @GetMapping
    public List<Passport> getAllPassPorts(){
        return passportServices.getAllpassports();
    }
    @GetMapping("/{id}")
    public Passport getPassport(@PathVariable Long id){
        return passportServices.getPassport(id);
    }
//    @DeleteMapping("/{id}")
//    public String  deletepassport(@PathVariable Long id){
//        passportServices.deletepassport(id);
//        return "Passport deleted successfully done";
//
//    }

}
