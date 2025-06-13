package com.henu.principles.designPrinciples.dimmitLaw;

public class dimmitLawDemo {
    public static void main(String[] args) {
        Star star = new Star("高圆圆");
        Company company = new Company("中国传媒公司");
        Fans fans = new Fans("小王");
        Agent agent = new Agent();
        agent.setStar(star);
        agent.setCompany(company);
        agent.setFans(fans);
        //商业活动
        agent.business();
        //粉丝见面
        agent.meeting();
    }
}
