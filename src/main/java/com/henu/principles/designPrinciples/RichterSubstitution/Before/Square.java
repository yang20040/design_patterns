package com.henu.principles.designPrinciples.RichterSubstitution.Before;
/**
 * @author ys
 * @date   2025/7/27
 */
public class Square extends Rectangle{
    public void setLength(double length)
    {
        super.setLength(length);
        super.setWidth(length);
    }
    public void setWidth(double width)
    {
        super.setLength(width);
        super.setWidth(width);
    }
}
