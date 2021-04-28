package ex.ex12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Ex12 {
    public static void main(String[] args) {

        List<Person> list = new ArrayList<>();
        list.addAll(Arrays.asList(
                new Person("山木","男",23),
                new Person("森戸","女",21),
                new Person("小関","男",19),
                new Person("梁川","女",19),
                new Person("船木","男",18)
        ));
        //一覧表示
        for (Person p:list) System.out.println(p);

        //検索する名前の入力
        Scanner in = new Scanner(System.in);
        System.out.println("検索する名前を入力");
        String name = in.nextLine();
        System.out.println(name);

        //名前のリストを作成する
        List<String> nameList = new ArrayList<>();
        for (Person p:list) {
            nameList.add(p.getName());
        }
        //検索する
        if (nameList.contains(name)) {
            System.out.println("カントリー・ガールズに" + name + "は存在します");
        } else {
            System.out.println("カントリー・ガールズに" + name + "は存在しません");
        }
        }
    }
