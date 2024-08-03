package com.testAppLearn.Improve_Spring_Framework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.testAppLearn.Improve_Spring_Framework.game")
public class AppGamingSpringBeans {

    // Beans automatiquement importés et par ComponentScan
    public static void main (String[] args) {
        try(AnnotationConfigApplicationContext context =
                    new AnnotationConfigApplicationContext(AppGamingSpringBeans.class)) {
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }
    }
}