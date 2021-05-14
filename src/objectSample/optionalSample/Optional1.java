package objectSample.optionalSample;

import java.util.Optional;

//Optionalクラスの使い方１
class Optional1 {
    public static void main(String[] args) {
        //生成 https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/util/Optional.html#of(T)
        Optional<String> opt1 = Optional.of("abc");
        //取得 https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/util/Optional.html#get()
        System.out.println(opt1.get());//abc

        //Nullだと例外になる
        Optional<String> opt2 = Optional.of(null);
    }
}