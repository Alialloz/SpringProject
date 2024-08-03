package com.testAppLearn.Improve_Spring_Framework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperJeuQualifier")
public class SuperJeu implements GamingConsole {
    public void up(){
        System.out.println("Up");
    }
    public void down(){
        System.out.println("Sliding");
    }
    public void left(){
        System.out.println("Going back");
    }
    public void right() {
        System.out.println("Shooting");
    }
}
