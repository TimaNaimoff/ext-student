package edu.selfstudy.ext.rest;



import edu.selfstudy.ext.service.StudentService;
import edu.selfstudy.ext.view.StudentRequest;
import edu.selfstudy.ext.view.StudentResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Component
@Path("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public List<StudentResponse> getStudentInfo(StudentRequest studentRequest){
         return studentService.getStudentInfo(studentRequest);
    }
}
