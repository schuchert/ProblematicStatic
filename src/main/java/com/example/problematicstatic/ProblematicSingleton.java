package com.example.problematicstatic;

public class ProblematicSingleton {
    private static ProblematicSingleton instance;

    public static ProblematicSingleton instance() {
        if(instance == null)
            instance = new ProblematicSingleton();
        return instance;
    }

    private ProblematicSingleton() {
        // do something that cannot be done on local machine
        // simulate by failing
        throw new RuntimeException();
    }
}
