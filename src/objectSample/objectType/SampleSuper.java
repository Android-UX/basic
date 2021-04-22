package objectSample.objectType;

//継承元のスーパークラス
class SampleSuper {
    //スーパークラスのフィールド　拡張されていない
    protected String superField;
//コンストラクタ
    public SampleSuper(String superField){
        this.superField = superField;
    }
//ゲッター
    public String getSuperField(){
        return superField;
    }
}
