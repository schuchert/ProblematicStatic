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

    public void startSession() {
        System.out.println("********************************************");
        System.out.println("Starting session...");
        System.out.println("********************************************");
    }

    public void stopSession() {
        System.out.println("********************************************");
        System.out.println("Stopping session...");
        System.out.println("********************************************");
    }

}
