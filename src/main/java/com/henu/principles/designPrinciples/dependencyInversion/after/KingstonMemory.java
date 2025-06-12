package com.henu.principles.designPrinciples.dependencyInversion.after;

public class KingstonMemory implements Memory{
    @Override
    public void save() {
        System.out.println("Kingston内存条保存数据");
    }
}
