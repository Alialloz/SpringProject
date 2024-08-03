package com.testAppLearn.Improve_Spring_Framework.examples.a1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan //("com.testAppLearn.Improve_Spring_Framework.examples.a0")
public class SimpleSpringContextLauncherApp {

    // Beans automatiquement importés et par ComponentScan
    public static void main (String[] args) {
        try(AnnotationConfigApplicationContext context =
                    new AnnotationConfigApplicationContext(SimpleSpringContextLauncherApp.class)) {

            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }
}