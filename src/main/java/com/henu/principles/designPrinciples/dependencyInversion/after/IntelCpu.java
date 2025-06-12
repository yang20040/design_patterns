package com.henu.principles.designPrinciples.dependencyInversion.after;

public class IntelCpu implements Cpu{
    @Override
    public void run() {
        System.out.println("IntelCpu开始运行");
    }
}
