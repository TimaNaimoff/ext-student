package edu.selfstudy.ext.domain;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Table(name="student_register")
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="student_id")
    private Long studentId;
    @Column(name="sur_name")
    private String surName;
    @Column(name="given_name")
    private String givenName;
    @Column(name="middle_name")
    private String middleName;
    @Column(name="date_of_birth")
    private LocalDate dateOfBirth;
    @Column(name="passport_seria")
    private String passportSeria;
    @Column(name="passport_number")
    private String passportNumber;
    @Column(name="passport_date")
    private LocalDate passportDate;
    @OneToMany(cascade={CascadeType.REFRESH},fetch=FetchType.LAZY,mappedBy = "student")
    private List<StudentDocument> studentDocuments;


    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPassportSeria() {
        return passportSeria;
    }

    public void setPassportSeria(String passportSeria) {
        this.passportSeria = passportSeria;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public LocalDate getPassportDate() {
        return passportDate;
    }

    public void setIssueDate(LocalDate passportDate) {
        this.passportDate = passportDate;
    }

    public void setPassportDate(LocalDate passportDate) {
        this.passportDate = passportDate;
    }

    public List<StudentDocument> getStudentDocuments() {
        return studentDocuments;
    }

    public void setStudentDocuments(List<StudentDocument> studentDocuments) {
        this.studentDocuments = studentDocuments;
    }
}
