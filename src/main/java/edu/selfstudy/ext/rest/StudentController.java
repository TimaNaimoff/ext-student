package edu.selfstudy.ext.rest;



import edu.selfstudy.ext.service.StudentService;
import edu.selfstudy.ext.view.StudentRequest;
import edu.selfstudy.ext.view.StudentResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@RestController
@RequestMapping(path="/student")
public class StudentController {
    @Autowired
    private StudentService studentService;
//    @POST
//    @Consumes(MediaType.APPLICATION_JSON)
//    @Produces(MediaType.APPLICATION_JSON)

    public List<StudentResponse> getStudentInfo(StudentRequest studentRequest){
         return studentService.getStudentInfo(studentRequest);
    }
    @GetMapping(path="/check")
    public String checkAdmin(){
        return "Rest Service is working!";
    }
}
