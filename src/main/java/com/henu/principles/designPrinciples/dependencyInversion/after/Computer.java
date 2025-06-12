package com.henu.principles.designPrinciples.dependencyInversion.after;

public class Computer {
    private Cpu cpu;
    private Memory memory;
    private HardDisk hardDisk;

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public void run()
    {
        System.out.println("电脑开始运行");
        String data = hardDisk.get();
        System.out.println("从硬盘中获取数据" + data);
        cpu.run();
        memory.save();
    }
}
