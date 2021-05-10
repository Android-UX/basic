package objectSample.setSample;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

//各Setの特徴 p141 p143　基本情報とも参照して覚える
class Set2 {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();//１発で見つけるが入力された順番は守らない　しかし一番早い　ハッシュ演算
        Set<Integer> linkedHashSet = new LinkedHashSet<>();//順番を保持　種類の一覧　データの追加と削除のために優秀
        Set<Integer> treeSet = new TreeSet<>();//データが追加される度に値を並び替える　二分木

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
