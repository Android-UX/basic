package objectSample.optionalSample;

import java.util.Optional;

//Optionalクラスの使い方２
class Optional3 {
    public static void main(String[] args) {
        //空のOptionalを作成 https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/util/Optional.html#empty()
        Optional<String> opt1 = Optional.empty();
        //System.out.println(opt1.get());
    }

}