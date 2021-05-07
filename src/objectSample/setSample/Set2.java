package objectSample.setSample;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

//各Setの特徴
class Set2 {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        Set<Integer> treeSet = new TreeSet<>();

        for (int i = 100; i > 0; i-=3) {
            hashSet.add(i);
            linkedHashSet.add(i);
            treeSet.add(i);
        }

        System.out.println("hashSet");
        System.out.println(hashSet);//ただの種類を保持する一覧　検索が高速
        System.out.println("linkedHashSet");
        System.out.println(linkedHashSet);//追加された順番を保持してくれる
        System.out.println("treeSet");
        System.out.println(treeSet);//デフォルトで昇順ソートしてくれる
    }
}
