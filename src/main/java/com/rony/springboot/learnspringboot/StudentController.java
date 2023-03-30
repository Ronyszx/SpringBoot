package com.rony.springboot.learnspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class StudentController {

    @RequestMapping("/details")
    public List<StudentDetails> retrieveStudentDetails() {
        return Arrays.asList(
                new StudentDetails("2KL19CS001", "Abhishek", "CSE"),
                new StudentDetails("2KL19CS002", "Arun", "CSE"),
                new StudentDetails("2KL19ME003", "Tom", "ME")
        );
    }


}
