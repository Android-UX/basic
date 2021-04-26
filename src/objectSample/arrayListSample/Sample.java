package objectSample.arrayListSample;

class Sample {
    private String name;
    private int age;

    //コンストラクタ　自動生成
    public Sample(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //ゲッター　自動生成
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Sample{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
