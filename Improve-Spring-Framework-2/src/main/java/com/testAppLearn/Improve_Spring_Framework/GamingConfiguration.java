package com.testAppLearn.Improve_Spring_Framework;

import com.testAppLearn.Improve_Spring_Framework.game.GameRunner;
import com.testAppLearn.Improve_Spring_Framework.game.GamingConsole;
import com.testAppLearn.Improve_Spring_Framework.game.MarioGame;
import com.testAppLearn.Improve_Spring_Framework.game.SuperJeu;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

    @Bean
    public GamingConsole game() {
        return new SuperJeu();
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game) {
        return new GameRunner(game);
    }

}
