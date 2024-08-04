package com.codally.springboot.learn_jpa_and_hibernate.course.jdbc;

import com.codally.springboot.learn_jpa_and_hibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class CourseJdbcRepository {

    @Autowired
    private JdbcTemplate springJdbcTemplate;

    private static String INSERT_QUERY =
            """
            insert into course (id,name,author)
            values(1,'Learn AWS','Codally');
            """;

    public void insert(Course course){
        springJdbcTemplate.update(INSERT_QUERY);
    }
}