package com.example.problematicstatic;

import org.junit.Test;

public class ProblematicSingletonTest {
    @Test
    public void getThisTestToPass() {
       ProblematicSingleton.instance();
    }
}
