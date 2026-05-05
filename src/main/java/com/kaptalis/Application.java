package com.kaptalis;

import java.util.logging.Logger;

public class Application {

    private static final Logger logger = Logger.getLogger("com.kaptalis");

    private Application() {
        // empêche l'instanciation
    }

    public static void main(String[] args) {
        System.out.println("Kaptalis Monitoring System - Active");
        logger.fine("Kaptalis Monitoring System - Active");
    }

    public static boolean isTemperatureValid(double temp) {
        return temp >= 2.0 && temp <= 8.0;
    }
}

