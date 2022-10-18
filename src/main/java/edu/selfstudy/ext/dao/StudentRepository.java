package edu.selfstudy.ext.dao;

import edu.selfstudy.ext.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Long> {
    @Query("SELECT st FROM Student st WHERE st.surName = :surName AND st.givenName=:givenName AND st.middleName =:middleName " +
            "AND st.dateOfBirth=:dateOfBirth AND st.passportSeria=:passportSeria " +
            "AND st.passportNumber=:passportNumber AND st.passportDate=:passportDate")

    List<Student>findStudent(@Param("surName")String surName,
                             @Param("givenName")String secondName,
                             @Param("middleName")String patronymic,
                             @Param("dateOfBirth")LocalDate dateOfBirth,
                             @Param("passportSeria")String passportSeria,
                             @Param("passportNumber")String passportNumber,
                             @Param("passportDate") LocalDate passportDate
                             );
}
