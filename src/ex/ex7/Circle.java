package ex.ex7;

public class Circle extends Figure{
    private double radius;//半径

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius,2);//Mathクラスの中にstaticメソッドのインスタンス（パイとパワー）が存在している
    }
//stringを円向けのメッセージに書き直している
    @Override
    public String toString() {
        return String.format("正円 半径:%.2f 面積:%.2f",
                radius,getArea());
    }
}
