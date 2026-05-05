package com.kaptalis;

public class Application {

    public Application() {}

    public static void main(String[] args) {
        System.out.println("Kaptalis Monitoring System - Active");
    }

    public static boolean isTemperatureValid(double temp) {
        return temp >= 2.0 && temp <= 8.0;
    }
}

