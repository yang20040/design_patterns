package com.henu.principles.designPrinciples.minimalInterface.Before;

public class SafetyDemp {
    public static void main(String[] args) {
        MySafetyDoor mySafetyDoor = new MySafetyDoor();
        mySafetyDoor.antiTheft();
        mySafetyDoor.fireProof();
        mySafetyDoor.waterProof();
    }
}
