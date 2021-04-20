package ex.ex8;

class Circle implements IfGetArea {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public String toString() {
        return String.format("正円 半径:%.2f 面積:%.2f",
                radius,getArea());
    }
}
