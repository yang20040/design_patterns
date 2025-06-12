package com.henu.principles.designPrinciples.dependencyInversion.before;

public class XiJieHardDisk {
    public void save(String data)
    {
        System.out.println("使用希捷硬盘保存数据：" + data);
    }
    public String get()
    {
        System.out.println("使用希捷硬盘获取数据");
        return "数据";
    }
}
