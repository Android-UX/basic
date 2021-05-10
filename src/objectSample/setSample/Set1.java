package objectSample.setSample;

import java.util.*;

//Setサンプル　教科書と一緒に見る　p140
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

        //合致しない値を全て削除する
        System.out.println(set.retainAll(Arrays.asList(1, 2, 3)));
        System.out.println(set);

        //値を全て削除
        set.clear();
        System.out.println(set);

        //サイズの取得
        System.out.println(set.size());//0　配列のlength
        //空であるか？
        System.out.println(set.isEmpty());//true　空っぽならtrue　状態を判定するメソッド is~
        set.add(1);
        System.out.println(set.isEmpty());//false
        //ArrayListからSet変換 p141
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,2,3,3,3));
        System.out.println(list);//1,2,2,3,3,3
        //リストを元にIntegerSetを作る　Array配列からSet配列に変換する
        Set<Integer> integerSet = new HashSet<>(list);
        System.out.println(integerSet);//1,2,3　同じデータが存在しない　メリット：検索するときに楽になる

        //値の存在を判定する
        System.out.println(integerSet.contains(2));//true
        System.out.println(integerSet.contains(4));//false
        System.out.println(integerSet.containsAll(Arrays.asList(1, 2, 3)));
        System.out.println(integerSet.containsAll(Arrays.asList(1, 2, 4)));

    }
}
