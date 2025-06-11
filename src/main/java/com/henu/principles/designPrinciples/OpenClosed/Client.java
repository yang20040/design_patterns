package com.henu.principles.designPrinciples.OpenClosed;

public class Client {
    public static void main(String[] args) {
        MySkin mySkin = new MySkin();
        SougouInput sougouInput = new SougouInput();
        sougouInput.setSkin(mySkin);
        sougouInput.display();
    }
}
