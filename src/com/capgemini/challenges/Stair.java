package com.capgemini.challenges;

public class Stair {

    public String buildStair(int stairSteps) {

        StringBuilder stair = new StringBuilder();

        for (int i = 0; i < stairSteps; i++) {
            for (int j = 1; j <= stairSteps; j++) {

                stair.append((j < stairSteps - i) ? " " : "*");
            }
            stair.append((i == stairSteps - 1) ? "" : "\n");
        }
        return String.valueOf(stair);
    }
}
