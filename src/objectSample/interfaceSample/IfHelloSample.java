package objectSample.interfaceSample;

//インターフェイス型の利用　抽象メソッドをかける特殊なクラス　クラスは変数の方を書ける
class IfHelloSample {
    public static void main(String[] args) {
        //インターフェイスの型になっている点に注意　IfHelloだけ変わってる　型として使ってる
        IfHello[] humans = {
                new American("Tom"),
                new Japanese("たけし"),
                new Chinese("李"),
                new French("Gabriel")
        };

        for (IfHello human:humans) {
            human.hello();//hello()の実装が確定しているので書ける
        }
    }
}