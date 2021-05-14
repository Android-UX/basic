package objectSample.optionalSample;

import java.util.Optional;

//Optionalクラスの使い方２
class Optional2 {
    public static void main(String[] args) {
        //生成 https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/util/Optional.html#ofNullable(T)
        Optional<String> opt1 = Optional.ofNullable("abc");
        Optional<String> opt2 = Optional.ofNullable(null);
        //取得 https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/util/Optional.html#get()
        opt1.ifPresent(v -> System.out.println(v));//abc
        opt2.ifPresent(v -> System.out.println(v));//実行されない
    }
}
