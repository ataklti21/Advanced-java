package com.atuka.StaticMethods;

public class Temperature {
    private double temperature;
    public static double maxTem=0;

    public Temperature(double t) {
        this.temperature = temperature;
        if (t>maxTem){
            maxTem=t;
        }
    }
}
