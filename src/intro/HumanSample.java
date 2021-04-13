package intro;

//人間クラスのインスタンスを作成する　プログラムに必要な情報をまとめたもの
public class HumanSample {
    public static void main(String[] args) {
        //インスタンスを作成する 単体で使うのではなく他のプログラムから呼び出す
        Human human1 = new Human("やまだ","男",35);//別の器
        Human human2 = new Human("たけだ","女",24);//別の器


        //各データを表示する
        System.out.println(human1.getName());//メソッドを呼び出している あなたの名前は何ですか？get+フィールド名 get大文字メソッド（キャメル）
        System.out.println(human1.getGender());
        System.out.println(human1.getAge());

        System.out.println(human2.getName());
        System.out.println(human2.getGender());
        System.out.println(human2.getAge());

        System.out.println(human1);
        System.out.println(human2);
    }

}
