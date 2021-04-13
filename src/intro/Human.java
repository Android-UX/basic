package intro;

//人間クラス　humanクラスのひな型
public class Human {
    //フィールド
    private String name;//文字列の名前 private=自分の中でしか見られない情報　外からは見れない カプセル化　書き換えられないように隠ぺいする
    private String gender;//文字列の性別
    private int age;//整数の年齢

    //コンストラクタ　インスタンスを作る時に使用されるメソッド
    public Human(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    //ゲッター　データを取得するメソッド
    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

}
