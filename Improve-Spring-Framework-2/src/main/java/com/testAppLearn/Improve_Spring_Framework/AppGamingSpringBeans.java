package com.testAppLearn.Improve_Spring_Framework;

import com.testAppLearn.Improve_Spring_Framework.game.GameRunner;
import com.testAppLearn.Improve_Spring_Framework.game.GamingConsole;
import com.testAppLearn.Improve_Spring_Framework.game.MarioGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppGamingSpringBeans {

    public static void main (String[] args) {


        try(AnnotationConfigApplicationContext context =
                    new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
            context.getBean(GamingConsole.class).up();

            context.getBean(GameRunner.class).run();

        }
    }
}
