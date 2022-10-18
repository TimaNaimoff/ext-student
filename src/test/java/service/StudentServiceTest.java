package service;

import edu.selfstudy.ext.rest.StudentController;
import edu.selfstudy.ext.view.StudentRequest;
import edu.selfstudy.ext.view.StudentResponse;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.util.List;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations={"classpath:springContext.xml"})
public class StudentServiceTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(StudentServiceTest.class);

    @Autowired
    private StudentController studentController;

     @Test
    public void studentInfo(){
         StudentRequest req=new StudentRequest();
         req.setSurName("Terran");
         req.setGivenName("Treyaris");
         req.setMiddleName("Balingan");
         req.setDateOfBirth(LocalDate.of(2000,4,16));
         req.setPassportNumber("123456");
         req.setPassportSeria("1234");
         req.setPassportDate(LocalDate.of(2016,5,30));

         List<StudentResponse> studentInfo = studentController.getStudentInfo(req);
         Assert.assertTrue(studentInfo.size()>0);
     }
}