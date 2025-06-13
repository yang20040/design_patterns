package com.henu.principles.designPrinciples.minimalInterface.After;

public class MySafetyDoor implements AntiTheft, Fireproof, Waterproof{
    public void antiTheft()
    {
        System.out.println("防盗");
    }
    public void fireProof()
    {
        System.out.println("防火");
    }
    public void waterProof()
    {
        System.out.println("防水");
    }
}
