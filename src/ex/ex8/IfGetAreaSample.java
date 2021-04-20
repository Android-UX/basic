package ex.ex8;

class IfGetAreaSample {

    public static void main(String[] args) {
        IfGetArea[] figures = {
                new Rectangle(10,10),
                new Circle(10),
                new Triangle(10,10)
        };
//メソッド　フィールド-する　isは状態　to-型を変更する
        for (IfGetArea figure:figures) {
            System.out.println(figure);
        }
    }
}
