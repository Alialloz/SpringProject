package com.testAppLearn.Improve_Spring_Framework.examples.c1;

import org.springframework.stereotype.Component;

@Component
public class MySqlDataService implements DataService {

    @Override
    public int[] retrieveData() {
        return new int[]{11, 22, 33, 44, 55};
    }
}
