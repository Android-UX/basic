package ex.ex11;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Ex11 {
    public static void main(String[] args) {
        //Personクラスを格納するArrayListを作成する
        //5人程度のインスタンスを追加する
        List<Person> list = new ArrayList<>();
        list.addAll(Arrays.asList(
                new Person("島倉","女性",20),
                new Person("平井", "男性",21),
                new Person("西田","女性",17),
                new Person("岡村","女性",16),
                new Person("前田","男性",18)
        ));
        //一覧表示
        System.out.println("一覧表示");
        for(Person p:list) System.out.println(p);

        //年齢の降順表示
        list.sort(Comparator.comparing(Person::getAge, Comparator.reverseOrder()));
        System.out.println("年齢の降順");
        for(Person p:list) System.out.println(p);

        //男性で年齢の降順で出力　男性のみの新しいArrayListを作ってソートする ifなどを用いて作る　
        //該当レコードのみコピー　それを処理対象としてコピー
        List<Person> mens = new ArrayList<>();
        for (Person p:list){
            if ("男性".equals(p.getGender()))mens.add(p);
        }
        mens.sort(Comparator.comparing(Person::getAge,Comparator.reverseOrder()));
        System.out.println("男性で年齢の降順");
        for (Person p:mens) System.out.println(p);
    }
}
