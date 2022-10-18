package edu.selfstudy.ext.service;


import edu.selfstudy.ext.dao.StudentRepository;
import edu.selfstudy.ext.domain.Student;
import edu.selfstudy.ext.domain.StudentDocument;
import edu.selfstudy.ext.view.StudentRequest;
import edu.selfstudy.ext.view.StudentResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class StudentService {

    private static final Logger LOGGER= LoggerFactory.getLogger(StudentService.class);

    @Autowired
    private StudentRepository studentRepository;

    @Transactional
    public List<StudentResponse> getStudentInfo(StudentRequest studentRequest){
        List<Student> studentList=studentRepository.findStudent(
                studentRequest.getSurName(),
                studentRequest.getGivenName(),
                studentRequest.getMiddleName(),
                studentRequest.getDateOfBirth(),
                studentRequest.getPassportSeria(),
                studentRequest.getPassportNumber(),
                studentRequest.getPassportDate());
        if(studentList.isEmpty()){
            return Collections.EMPTY_LIST;
        }
        List<StudentDocument>docs=studentList.get(0).getStudentDocuments();
        List<StudentResponse> response = docs.stream().map(d -> getResponse(d)).collect(Collectors.toList());
        return response;
    }
    private StudentResponse getResponse(StudentDocument s){
        StudentResponse studentResponse=new StudentResponse();
        studentResponse.setStudentDocumentDate(s.getStudentDocumentDate());
        studentResponse.setExpiredDate(s.getExpiredDate());
        studentResponse.setFacultyName(s.getFaculty().getFacultyName());
        studentResponse.setUniversityName(s.getFaculty().getUniversity().getUniversityName());
        studentResponse.setStudentForm(s.getStudentForm().toString());
        return studentResponse;
    }
}

