package edu.selfstudy.ext.view;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.time.LocalDate;


public class StudentRequest {
    private String surName;
    private String givenName;
    private String middleName;
   // @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @JsonSerialize(converter=LocalDateStringConverter.class)
    @JsonDeserialize(converter=StringLocalDateConverter.class)
    private LocalDate dateOfBirth;
    private String passportNumber;
    private String passportSeria;
    @JsonSerialize(converter=LocalDateStringConverter.class)
    @JsonDeserialize(converter=StringLocalDateConverter.class)
    private LocalDate passportDate;

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

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getPassportSeria() {
        return passportSeria;
    }

    public void setPassportSeria(String passportSeria) {
        this.passportSeria = passportSeria;
    }

    public LocalDate getPassportDate() {
        return passportDate;
    }

    public void setPassportDate(LocalDate passportDate) {
        this.passportDate = passportDate;
    }
}
