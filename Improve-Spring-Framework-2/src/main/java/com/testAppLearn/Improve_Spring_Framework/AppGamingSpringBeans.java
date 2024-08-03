package com.testAppLearn.Improve_Spring_Framework;

import com.testAppLearn.Improve_Spring_Framework.game.GameRunner;
import com.testAppLearn.Improve_Spring_Framework.game.GamingConsole;
import com.testAppLearn.Improve_Spring_Framework.game.SuperJeu;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppGamingSpringBeans {

    @Bean
    public GamingConsole game() {
        return new SuperJeu();
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game) {
        return new GameRunner(game);
    }

    public static void main (String[] args) {
        try(AnnotationConfigApplicationContext context =
                    new AnnotationConfigApplicationContext(AppGamingSpringBeans.class)) {
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }
    }
}