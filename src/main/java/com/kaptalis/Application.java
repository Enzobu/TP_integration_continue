package com.kaptalis;

import java.util.logging.Logger;

public final class Application {

    private static final Logger LOGGER = Logger.getLogger(Application.class.getName());

    private Application() {
        // Utility class
    }

    public static void main(final String[] args) {
        LOGGER.info("Kaptalis Monitoring System - Active");
    }

    public static boolean isTemperatureValid(final double temp) {
        return temp >= 2.0 && temp <= 8.0;
    }
}