package com.testAppLearn.Improve_Spring_Framework.examples.c1;

public class MongoDbDataService implements DataService {

    @Override
    public int[] retrieveData() {
        return new int[]{1, 2, 3, 4, 5};
    }
}
