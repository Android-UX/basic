package objectSample.Inheritance;

class Japanese extends Human {
    //フィールドnameに継承されているので存在する　再定義する　コンストラクタを書くと赤い波線は消える

    //定義　記述しないといけないもの　コンストラクタは必ず再定義しないといけない　デフォルトコンストラクタ クラス名と同じ名前のメソッド
    public Japanese(String name) {
        super(name);//super()スーパークラスのコンストラクタ　コンストラクタだけは新しく入力する
    }

    //上書き　サブクラスで内容を書き換えて機能を変更できる　同じメソッドでも違う機能を持てる　多態性　ポリモーフィズム
    @Override
    public void hello(){
        System.out.println("こんにちは、私の名前は" + name + "です。");
    }
}
