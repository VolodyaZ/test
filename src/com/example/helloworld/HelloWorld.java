package com.example.helloworld;

import java.util.concurrent.TimeUnit;

public class HelloWorld {
    public static void main(String[] args) throws Exception {
        final int NUM_OF_ITERATIONS = 1000;
        final int WAVE_SIZE = 7;
        final double NUM_OF_PERIODS = 140;
        final double PRECISION = 0.5;
        for (double i = 0; i < Math.PI * NUM_OF_PERIODS; i += NUM_OF_PERIODS * Math.PI / NUM_OF_ITERATIONS) {
            String  str = new String();
            for (int j = 0; j < (Math.sin(i) + 1) * WAVE_SIZE; j++) {
                str += " ";
            }
            double current = (Math.sin(i)) * WAVE_SIZE;
            double prev = (Math.sin(i - NUM_OF_PERIODS * Math.PI / NUM_OF_ITERATIONS)) * WAVE_SIZE;
            if (Math.abs((current - prev)) < PRECISION) {
                str += "|";
            } else if (current > prev) {
                str += "\\";
            } else if (current < prev) {
                str += "/";
            }
            System.out.println(str);

            Thread.sleep(100);
        }
    }
}
