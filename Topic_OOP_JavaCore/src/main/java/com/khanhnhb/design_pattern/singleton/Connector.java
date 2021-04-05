package com.khanhnhb.design_pattern.singleton;

public class Connector {

    private static Connector instance = null;

    private Connector() {}

    public static synchronized Connector getInstance() {
        if (instance == null) {
            instance = new Connector();
        }
        return instance;
    }

    public String showMessage() {
         return "Init connector";
    }
}
