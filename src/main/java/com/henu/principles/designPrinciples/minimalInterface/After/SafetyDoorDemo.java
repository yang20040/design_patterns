package com.henu.principles.designPrinciples.minimalInterface.After;

public class SafetyDoorDemo {
    public static void main(String[] args) {
        MySafetyDoor mySafetyDoor = new MySafetyDoor();
        mySafetyDoor.antiTheft();
        mySafetyDoor.fireProof();
        mySafetyDoor.waterProof();
        NewSafetyDoor newSafetyDoor = new NewSafetyDoor();
        newSafetyDoor.fireProof();
        newSafetyDoor.waterProof();
    }
}
