package objectSample.objectType;

public class SampleMain {
    public static void main(String[] args) {
        //スーパークラスの型の変数
        //スーパークラスの型でインスタンスを作成
        SampleSuper sampleSuper = new SampleSuper("abc");
        //スーパークラスで定義されたgetSuperField()のみ使用可能
        System.out.println(sampleSuper.getSuperField());

        //サブクラスの型で変数定義
        //サブクラスの型でインスタンスを作成
        SampleSub1 sampleSub1 = new SampleSub1("abc");
        //サブクラスで定義された3種類のメソッドが使用できる
        sampleSub1.getSuperField();
        sampleSub1.methodA();
        sampleSub1.methodB();

        //インターフェイスMethodA型の変数を定義　まずは型の制約を見る
        //サブクラスの型でインスタンスを作成　スーパークラスの型にサブクラスは代入できる　サブクラスにスーパークラスは代入できない
        IfMethodA sampleSub2 = new SampleSub1("abc");
        //インターフェイスMethodAで定義されてるメソッドのみ使用ができる
        sampleSub2.methodA();

        //逆はコンパイルエラーになる　継承のメソッド　
        // 継承のメリットは同じメソッドを引き継いでオーバーライド変更するため　拡張するため　追加でメソッドやフィールドを増やす　ポリモーフィズムを主体に設計する　
        //スーパークラスの型の変数
        //スーパークラスの型でインスタンスを作成
        SampleSuper sampleSuper1 = new SampleSub1("abc");
        sampleSuper1.getSuperField();
    }
}
