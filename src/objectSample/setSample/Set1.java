package objectSample.setSample;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//Setサンプル
class Set1 {
    public static void main(String[] args) {
        //整数型HashSetを定義
        Set<Integer> set = new HashSet<>();
        //データを追加する
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        //表示する
        System.out.println(set);
        //存在する値は追加されない
        System.out.println(set.add(1));//false　追加されてないから
        System.out.println(set);
        //存在する値は追加される
        System.out.println(set.add(6));//true
        System.out.println(set);
        //値を複数追加する
        System.out.println(set.addAll(Arrays.asList(7, 8, 9)));//true
        System.out.println(set);
        System.out.println(set.addAll(Arrays.asList(9,10)));//1つでも追加できるからtrue
        System.out.println(set);
        System.out.println(set.addAll(Arrays.asList(9,10)));//存在しているからfalse
        System.out.println(set);
        //値を削除する
        System.out.println(set.remove(10));//true
        System.out.println(set);
        System.out.println(set.remove(10));//false
        System.out.println(set);
        //合致する値を全て削除
        System.out.println(set.removeAll(Arrays.asList(7, 8, 9)));
        System.out.println(set);
        System.out.println(set.removeAll(Arrays.asList(6, 7)));
        System.out.println(set);
        System.out.println(set.removeAll(Arrays.asList(6, 7)));
        System.out.println(set);
    }
}
