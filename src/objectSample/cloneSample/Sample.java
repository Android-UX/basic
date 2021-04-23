package objectSample.cloneSample;

import java.util.Arrays;

//クローンメソッドの実装
class Sample implements Cloneable {
    private int num;//基本型
    private Node node;//参照型

    public Sample(int num, Node node) {
        this.num = num;
        this.node = node;
    }

    @Override
    public String toString() {
        return "Sample{" +
                "num=" + num +
                ", node=" + node +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
