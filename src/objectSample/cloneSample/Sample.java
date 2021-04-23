package objectSample.cloneSample;


//クローンメソッドの実装　参照型の複製をするためのメソッド？
class Sample implements Cloneable {
    private int num;//基本型
    private Node node;//参照型


    public Sample(int num, Node node) {
        this.num = num;
        this.node = new Node(node);//ポインタの参照を断ち切るため
        // new　演算子で新しい別インスタンスとして複製して引っ張る
        // 片側を変えてもう片方が変わらないようにする
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setNode(Node node) {
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
    public Sample clone()  {
        Sample clone = null;
        try {
            //オブジェクトクラスのクローンメソッドで複製する
            clone = (Sample) super.clone();
            //参照型のフィールドを個別に複製する
            clone.node = node.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();//例外時のトレース
        }
        return clone;//複製を返却する
    }

}
