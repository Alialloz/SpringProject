package com.codally.springboot.learn_jpa_and_hibernate.course;

import com.codally.springboot.learn_jpa_and_hibernate.course.jdbc.CourseJdbcRepository;
import com.codally.springboot.learn_jpa_and_hibernate.course.jpa.CourseJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class CourseCommandLineRunner implements CommandLineRunner {
    // @Autowired
    // private CourseJdbcRepository repository;

    @Autowired
    private CourseJpaRepository repository;


    @Override
    public void run(String... args) throws Exception {
       repository.insert(new Course(1, "Learn AWS now!", "Codally"));

       //repository.delete(1);

        System.out.println(repository.findById(1L));
    }
}
