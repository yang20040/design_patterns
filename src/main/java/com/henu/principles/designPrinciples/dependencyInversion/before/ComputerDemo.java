package com.henu.principles.designPrinciples.dependencyInversion.before;

public class ComputerDemo {
    public static void main(String[] args)
    {
        IntelCpu cpu = new IntelCpu();
        KingstonMemory memory = new KingstonMemory();
        XiJieHardDisk hardDisk = new XiJieHardDisk();
        Computer computer = new Computer();
        computer.setCpu(cpu);
        computer.setMemory(memory);
        computer.setHardDisk(hardDisk);
        computer.run();
    }
}
