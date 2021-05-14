package objectSample.optionalSample;

import java.util.Optional;

//Optionalクラスの使い方2　一番使う目的が明確
class Optional2 {
    public static void main(String[] args) {
        //生成
        Optional<String> opt1 = Optional.ofNullable("abc");
        Optional<String> opt2 = Optional.ofNullable(null);
        //取得 getメソッド
        opt1.ifPresent(v -> System.out.println(v));//abc　vはvalueで値
        opt2.ifPresent(v -> System.out.println(v));//実行されない consumer　値を戻さないで消費する　ラムダ式
    }
}
