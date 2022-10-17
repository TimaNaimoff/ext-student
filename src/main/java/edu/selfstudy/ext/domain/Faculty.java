package edu.selfstudy.ext.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="sr_faculty")
public class Faculty {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="faculty_id")
    private Long id;
    @ManyToOne(cascade={CascadeType.REFRESH},fetch =FetchType.LAZY)
    @JoinColumn(name="university_id")
    private University university;
    @Column(name="faculty_name")
    private String facultyName;
    @OneToMany(cascade={CascadeType.REFRESH},fetch=FetchType.LAZY,mappedBy="faculty")
    private List<StudentDocument> studentDocuments;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public List<StudentDocument> getStudentDocuments() {
        return studentDocuments;
    }

    public void setStudentDocuments(List<StudentDocument> studentDocuments) {
        this.studentDocuments = studentDocuments;
    }
}
