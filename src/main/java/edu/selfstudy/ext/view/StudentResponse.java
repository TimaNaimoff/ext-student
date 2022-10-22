package edu.selfstudy.ext.view;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.time.LocalDate;

public class StudentResponse {
    private String studentDocumentNumber;
    @JsonSerialize(converter=LocalDateStringConverter.class)
    @JsonDeserialize(converter=StringLocalDateConverter.class)
    private LocalDate studentDocumentDate;
    @JsonSerialize(converter=LocalDateStringConverter.class)
    @JsonDeserialize(converter=StringLocalDateConverter.class)
    private LocalDate expiredDate;
    private String facultyName;
    private String universityName;
    private String studentForm;

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getStudentDocumentNumber() {
        return studentDocumentNumber;
    }

    public void setStudentDocumentNumber(String studentDocumentNumber) {
        this.studentDocumentNumber = studentDocumentNumber;
    }

    public LocalDate getStudentDocumentDate() {
        return studentDocumentDate;
    }

    public void setStudentDocumentDate(LocalDate studentDocumentDate) {
        this.studentDocumentDate = studentDocumentDate;
    }

    public LocalDate getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(LocalDate expiredDate) {
        this.expiredDate = expiredDate;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public String getStudentForm() {
        return studentForm;
    }

    public void setStudentForm(String studentForm) {
        this.studentForm = studentForm;
    }
}
