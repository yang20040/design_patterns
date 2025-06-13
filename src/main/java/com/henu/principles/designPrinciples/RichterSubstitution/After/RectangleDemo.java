package com.henu.principles.designPrinciples.RichterSubstitution.After;


/**
 * @author ys
 * @date   2025/7/27
 */
public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(10);
        rectangle.setWidth(5);
        resize( rectangle);
        printLengthAndWidth(rectangle);
        System.out.println("--------------");
        Square square = new Square();
        square.setSide(10);
        //测试
//        resize(square);
//        printLengthAndWidth(square);
    }
    public static void  resize(Rectangle rectangle){
        //长大于宽时,宽+1(循环请求)
        while (rectangle.getLength() >= rectangle.getWidth()){
            rectangle.setWidth(rectangle.getWidth() + 1);
        }
    }
    public static void printLengthAndWidth(Rectangle rectangle){
        System.out.println("长:" + rectangle.getLength());
        System.out.println("宽:" + rectangle.getWidth());
    }
}
