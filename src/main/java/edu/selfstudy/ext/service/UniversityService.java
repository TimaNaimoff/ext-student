package edu.selfstudy.ext.service;

import edu.selfstudy.ext.dao.FacultyRepository;
import edu.selfstudy.ext.dao.UniversityRepository;
import edu.selfstudy.ext.domain.Faculty;
import edu.selfstudy.ext.domain.University;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class UniversityService {
    @Autowired
    private UniversityRepository universityRepository;

    @Autowired
    private FacultyRepository facultyRepository;


    @Transactional(readOnly = true)
    public List<University> findUniversities(){
        return universityRepository.findAll();
    }
    @Transactional(readOnly=true)
    public List<University>findFullUniversities(){
          return universityRepository.findFullList();
    }

    @Transactional(readOnly=true)
    public List<Faculty>findFaculties(){
        return facultyRepository.findAll();
    }
    @Transactional(readOnly=true)
    public Faculty findFaculty(Long facultyId){
        Optional<Faculty> fop = facultyRepository.findById(facultyId);
        Faculty faculty=fop.get();
        Hibernate.initialize(faculty.getUniversity());
        return faculty;
    }
    @Transactional
    public University getUniversity(Long universityId){
        University university=universityRepository.findById(universityId).get();
        Hibernate.initialize(university.getFaculties());
        return university;
    }

}
