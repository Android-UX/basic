package objectSample.abstractSample;

class Japanese extends Human {
    //フィールドnameに継承されているので存在する　再定義する　コンストラクタを書くと赤い波線は消える

    public Japanese(String name) {
        super(name);//super()スーパークラスのコンストラクタ　コンストラクタだけは新しく入力する
    }

    //抽象クラスではオーバーライドが必要　抽象の機能を前提とした仕組み　抽象メソッドを継承している
    // 　かっこの中身が決まってるのが実装　それぞれの言語で挨拶する　Override記名しないとコンパイルエラーになる
    @Override
    public void hello(){
        System.out.println("こんにちは、私の名前は" + name + "です。");
    }
}
