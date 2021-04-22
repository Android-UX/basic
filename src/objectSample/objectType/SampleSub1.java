package objectSample.objectType;

//サブクラス1 ,でインターフェイスの多重実装ができる getterが継承されてる　フィールドが書かれてない　継承されてるから superはスーパークラスのコンストラクタと全く同じ記述
public class SampleSub1 extends SampleSuper implements IfMethodA,IfMethodB {
    //コンストラクタ　スーパークラスのコンストラクタを呼び出してる　プログラムは繋がりがある　継承　インスタンスを作るための機能
    public SampleSub1(String superField) {
        super(superField);
    }

    @Override
    public void methodA() {
        System.out.println("A");
    }

    @Override
    public void methodB() {
        System.out.println("B");
    }
}
