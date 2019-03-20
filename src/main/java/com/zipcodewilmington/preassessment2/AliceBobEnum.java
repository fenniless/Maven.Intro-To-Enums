package com.zipcodewilmington.preassessment2;

public enum AliceBobEnum {
    ALICE,
    BOB;

    public String getCatchPhrase() {
        if(this.isAlice()){
            return "Hey, my name is ALICE!";
        }
        if(this.isBob()){
            return "Hey, my name is BOB!";
        }
        return null;
    }

    public boolean isAlice() {
        if (this==ALICE){
            return true;
        } else {
            return false;
        }
    }

    public boolean isBob() {
        if (this==BOB){
            return true;
        } else {
            return false;
        }
    }
}
