package com.kaptalis;

public class App {
    String unusedVariable = "Audit_MedTech";

       public static void main(String[] args) {
        System.out.println("Kaptalis Monitoring System - Active");
    }

    public static boolean isTemperatureValid(double temp) {
        return temp >= 2.0 && temp <= 8.0;
    }
}

