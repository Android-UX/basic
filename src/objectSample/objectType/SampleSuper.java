package objectSample.objectType;

//継承元のスーパークラス
class SampleSuper {
    //スーパークラスのフィールド　拡張されていない
    protected String superField;

    public SampleSuper(String superField){
        this.superField = superField;
    }

    public String getSuperField(){
        return superField;
    }
}
