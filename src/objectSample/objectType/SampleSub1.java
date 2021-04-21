package objectSample.objectType;

//サブクラス1 ,でインターフェイスの多重実装ができる
public class SampleSub1 extends SampleSuper implements IfMethodA,IfMethodB {
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
