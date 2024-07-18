package com.grayMatter.banking;

public class Engine {
    private String type;

    public Engine(String type) {
        this.type = type;
    }

    public void start() {
        System.out.println("Engine started. Type: " + type);
    }

    public void stop() {
        System.out.println("Engine stopped.");
    }

    public String getType() {
        return type;
    }
}
