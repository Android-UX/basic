package objectSample.optionalSample;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class Optional4 {
    public static void main(String[] args) {
        Optional<String> opt1 = Optional.ofNullable("abc");//重要
        Optional<String> opt2 = Optional.ofNullable(null);

        //Nullの場合、別な値を返す
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/util/Optional.html#orElse(T)
        System.out.println(opt1.orElse("xyz"));//abc
        System.out.println(opt2.orElse("xyz"));//xyz

        //Nullかどうか判断する　重要
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/util/Optional.html#isPresent()
        System.out.println(opt1.isPresent());//true
        System.out.println(opt2.isPresent());//false

        //値をフィルターする
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/util/Optional.html#filter(java.util.function.Predicate)
        List<Optional<Integer>> optionalList = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            optionalList.add(Optional.ofNullable(i));
        }

        //v -> v >= 5 がtrueなら値の入っているOptionalを返す
        //空で無ければ出力をする
        System.out.println("値のフィルター");
        for (Optional<Integer> opt:optionalList) {
            opt.filter(v -> v >= 5).ifPresent(v -> System.out.println(v));
        }

        //値を加工する
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/util/Optional.html#map(java.util.function.Function)
        System.out.println("値を加工する");
        for (Optional<Integer> opt:optionalList) {
            opt.map(v -> v*2).ifPresent(v -> System.out.println(v));//Mapファンクション型メソッド　引数vを2倍して戻す　処理と突き合わせる　()の中にある処理を適応する
            // ifPresent　コンシューマー型　前まで加工した結果が表示される　存在すれば表示する　nullチェックを省く
        }

    }
}