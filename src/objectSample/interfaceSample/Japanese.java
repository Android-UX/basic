package objectSample.interfaceSample;

//日本人クラス　インターフェイス版 必ずHelloクラスをもってる メソッドだけに関する制約　多重継承　継承がありすぎるとインターフェイスにする
// 進化してる　必ずhelloメソッドがあるという制約　柔軟な書き方　クラスの型　どうやって区別して使う
class Japanese implements IfHello{
    private String name;

    public Japanese(String name) {
        this.name = name;
    }

    @Override
    public void hello() {
        System.out.println("こんにちは、私の名前は" + name + "です。");
    }
}
