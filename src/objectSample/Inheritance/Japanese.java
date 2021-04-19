package objectSample.Inheritance;

class Japanese extends Human {
    //フィールドnameに継承されているので存在する　再定義する　コンストラクタを書くと赤い波線は消える

    public Japanese(String name) {
        super(name);//super()スーパークラスのコンストラクタ　コンストラクタだけは新しく入力する
    }

    @Override
    public void hello(){
        System.out.println("こんにちは、私の名前は" + name + "です。");
    }
}
