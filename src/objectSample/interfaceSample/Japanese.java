package objectSample.interfaceSample;

//日本人クラス　インターフェイス版 必ずHelloクラスをもってる メソッドだけに関する制約　多重継承　進化してる
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
