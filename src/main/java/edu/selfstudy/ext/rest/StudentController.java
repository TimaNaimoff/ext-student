package edu.selfstudy.ext.rest;



import edu.selfstudy.ext.service.StudentService;
import edu.selfstudy.ext.view.StudentRequest;
import edu.selfstudy.ext.view.StudentResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.*;
import java.util.List;

@RestController
@RequestMapping(path="/student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping(consumes={MediaType.APPLICATION_JSON_VALUE},produces={MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public List<StudentResponse> getStudentInfo(@RequestBody StudentRequest studentRequest){
         return studentService.getStudentInfo(studentRequest);
    }
    @GetMapping(path="/check")

    public String checkAdmin(){
        return "Rest Service is working!";
    }
}
