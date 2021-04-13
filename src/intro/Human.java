package intro;

//人間クラス　humanクラスのひな型　器
    class Human {
    //フィールド データを記憶する場所　情報を保存
    private String name;//文字列の名前 private=自分の中でしか見られない情報　外からは見れない カプセル化　書き換えられないように隠ぺいする
    private String gender;//文字列の性別
    private int age;//整数の年齢

    //コンストラクタ　インスタンスを作る時に使用される専用のメソッド　機能　名前、性別、年齢を外からもらって答える　情報を外部から受け取って実体を作る
    public Human(String name, String gender, int age) {//必ずpublic クラス名()引数
        this.name = name;//これの情報　自分自身の情報 this = それぞれのインスタンス毎の
        this.gender = gender;
        this.age = age;
    }

    //ゲッター　データを取得するメソッド
    public String getName() {//publicはどこからでも見れるアクセス修飾子　String戻り値の型 getName()メソッド名
        return name;//名前を返す　答えを返却する　値を返す　関数とかファンクション
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' + //エスケープシーケンス
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
