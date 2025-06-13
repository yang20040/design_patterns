package com.henu.principles.designPrinciples.dimmitLaw;

public class Agent {
    private Star star;
    private Fans fans;
    private Company company;

    public void setStar(Star star) {
        this.star = star;
    }

    public void setFans(Fans fans) {
        this.fans = fans;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void business()
    {
        System.out.println("明星:" + star.getName() + "和公司:" + company.getName() + "洽谈业务");
    }
    public void meeting()
    {
        System.out.println("明星:" + star.getName() + "和粉丝:" + fans.getName() + "见面");
    }
}
