package com.henu.principles.designPrinciples.dependencyInversion.after;

public class ComputerDemo {
    public static void main(String[] args) {
        Cpu cpu = new IntelCpu();
        Memory memory = new KingstonMemory();
        HardDisk hardDisk = new XiJieHardDisk();
        Computer computer = new Computer();
        computer.setCpu(cpu);
        computer.setMemory(memory);
        computer.setHardDisk(hardDisk);
        computer.run();
    }
}
