package com.codally.springboot.learn_spring_boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses(){
        return Arrays.asList(
                new Course (1,"Learn AWS", "Codally"),
                new Course (2,"Learn DevOps", "Codally"),
                new Course(3, "Learn Spring Boot", "Codally"),
                new Course(4, "Learn Azure", "Codally")
        );
    }

}
