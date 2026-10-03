package com.example.student_managementhiber.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Passport")
public class Passport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true,nullable = false)
    private String passportName;

    private String country;

    public Passport(){

    }
    public Passport(String passportName,String country){
     this.passportName = passportName;
     this.country = country;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassportName() {
        return passportName;
    }

    public void setPassportName(String passportName) {
        this.passportName = passportName;
    }
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "id=" + id +
                ", passportName='" + passportName + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
