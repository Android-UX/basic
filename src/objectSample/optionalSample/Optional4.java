package objectSample.optionalSample;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class Optional4 {
    public static void main(String[] args) {
        Optional<String> opt1 = Optional.ofNullable("abc");
        Optional<String> opt2 = Optional.ofNullable(null);

        //Nullの場合、別な値を返す
        System.out.println(opt1.orElse("xyz"));//abc
        System.out.println(opt2.orElse("xyz"));//xyz

        //Nullかどうか判断する
        System.out.println(opt1.isPresent());//true
        System.out.println(opt2.isPresent());//false

        //値をフィルターする
        List<Optional<Integer>> optionalList = new ArrayList<>();
        for (int i = 0; i < 11 ; i++) {
            optionalList.add(Optional.ofNullable(i));
        }
        for (Optional<Integer> opt:optionalList) {
            System.out.println(opt.filter(v -> v >= 5));
        }
    }
}
