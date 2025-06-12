package com.henu.principles.designPrinciples.dependencyInversion.before;

public class Computer {
    private IntelCpu cpu;
    private KingstonMemory memory;
    private XiJieHardDisk hardDisk;

    public IntelCpu getCpu() {
        return cpu;
    }

    public void setCpu(IntelCpu cpu) {
        this.cpu = cpu;
    }

    public KingstonMemory getMemory() {
        return memory;
    }

    public void setMemory(KingstonMemory memory) {
        this.memory = memory;
    }

    public XiJieHardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(XiJieHardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public void run() {
        System.out.println("电脑开始运行");
        String data = hardDisk.get();
        System.out.println("从硬盘中获取数据" + data);
        cpu.run();
        memory.save();
    }
}
