package com.codally.springboot.learn_jpa_and_hibernate.course;

import com.codally.springboot.learn_jpa_and_hibernate.course.jdbc.CourseJdbcRepository;
import com.codally.springboot.learn_jpa_and_hibernate.course.jpa.CourseJpaRepository;
import com.codally.springboot.learn_jpa_and_hibernate.course.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class CourseCommandLineRunner implements CommandLineRunner {
    // @Autowired
    // private CourseJdbcRepository repository;

    //@Autowired
    //private CourseJpaRepository repository;

    @Autowired
    private CourseSpringDataJpaRepository repository;


    @Override
    public void run(String... args) throws Exception {
       repository.save(new Course(1, "Learn AWS now!", "Codally"));
       repository.save(new Course(1, "Learn Azure now!", "Ali"));
       repository.save(new Course(1, "Learn Spring now!", "Morgan"));


        //repository.delete(1);

        System.out.println(repository.findById(1L));
        System.out.println(repository.findAll());
        System.out.println(repository.count());

        // NOT WORKING
        //System.out.println(repository.findByName("Learn AWS now!"));
    }
}
