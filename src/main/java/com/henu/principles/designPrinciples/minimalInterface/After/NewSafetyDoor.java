package com.henu.principles.designPrinciples.minimalInterface.After;

public class NewSafetyDoor implements Fireproof, Waterproof{
    @Override
    public void fireProof() {
        System.out.println("更防火");
    }

    @Override
    public void waterProof() {
        System.out.println("更防水");
    }
}
