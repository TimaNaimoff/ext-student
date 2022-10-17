package edu.selfstudy.ext.domain;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="sr_student_document")
public class StudentDocument {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="std_id")
    private Long studentDocumentId;
    @Column(name="std_number")
    private String studentDocumentNumber;
    @Column(name="std_date")
    private LocalDate studentDocumentDate;
    @Column(name="expired_date")
    private LocalDate expiredDate;
    @ManyToOne(cascade={CascadeType.REFRESH},fetch=FetchType.LAZY)
    @JoinColumn(name="student_id")
    private Student student;
    @ManyToOne(cascade={CascadeType.REFRESH},fetch=FetchType.LAZY)
    @JoinColumn(name="faculty_id")
    private Faculty faculty;
    @Column(name="student_form")
    @Enumerated
    private StudentForm studentForm;

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public Long getStudentDocumentId() {
        return studentDocumentId;
    }

    public void setStudentDocumentId(Long studentDocumentId) {
        this.studentDocumentId = studentDocumentId;
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

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public StudentForm getStudentForm() {
        return studentForm;
    }

    public void setStudentForm(StudentForm studentForm) {
        this.studentForm = studentForm;
    }
}
