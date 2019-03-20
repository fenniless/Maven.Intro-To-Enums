package com.zipcodewilmington.preassessment2;

public class AliceBobEvaluator {
private String name;

    public AliceBobEvaluator(String input) {
        this.name = input;
    }

    public boolean isAlice() {
        if (name.equals("Alice")){
            return true;
        } else {
            return false;
        }
    }

    public boolean isBob() {
        if (name.equals("Bob")){
            return true;
        } else {
            return false;
        }
    }
}
