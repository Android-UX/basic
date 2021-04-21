package objectSample.abstractSample;

    //抽象クラスのメソッド　継承を前提としているクラス　
    abstract class Human {
    protected String name;

    public Human(String name){ this.name = name;}

    //抽象メソッドがあれば必ず抽象クラス　戻り値とメソッド名と引数のみ宣言されている　インスタンスが作れない
    //メソッドの処理が記述されていない　波かっこがない　オーバーライド　継承が前提　一部不完全 helloメソッドは存在しているがoverride前提
    //サブクラス毎に処理が違うものは抽象クラス Override制約　overrideしないといけない　継承の仕組みを使ってメソッドを実装するだけ
    public abstract void hello();
}
