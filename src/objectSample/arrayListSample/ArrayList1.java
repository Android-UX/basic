package objectSample.arrayListSample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//ArrayListの利用
class ArrayList1 {
    public static void main(String[] args) {
        //List<データの型> 変数名 = new ArrayList<>(); <>はダイヤモンド演算子
        List<Integer> list = new ArrayList<>();

        //データの末尾への追加
        list.add(10);
        list.add(20);
        list.add(30);

        //データの取得・参照
        System.out.println(list.get(0));//要素0を表示 10
        System.out.println(list.get(1));//要素0を表示 20
        System.out.println(list.get(2));//要素0を表示 30
        System.out.println(Arrays.toString(list.toArray()));//配列に変換して出力

        for(Integer i:list) System.out.println(i);//拡張for命令で出力

        //データの挿入　間に差し込む
        list.add(1,50);
        System.out.println(Arrays.toString(list.toArray()));

        //データの末尾に複数追加する
        list.addAll(Arrays.asList(100,60,90));//配列をListに変換　addAll末尾にそのまま全部足す
        System.out.println(Arrays.toString(list.toArray()));

        //複数のデータを指定された位置に挿入する
        list.addAll(2,Arrays.asList(40,80,70));
        System.out.println(Arrays.toString(list.toArray()));

        //データの削除
        list.remove(0);//要素0を削除
        System.out.println(Arrays.toString(list.toArray()));
        list.remove(Integer.valueOf(100));//100という値を削除
        System.out.println(Arrays.toString(list.toArray()));

        //データの複数削除(一致したもの)
        list.remove(Arrays.asList(40, 50,100));//40 50 削除
        Arrays.toString(list.toArray());

        //データの複数削除(一致しないもの)
        list.retainAll(Arrays.asList(40, 60,90));//30 60 90以外を削除
        System.out.println(Arrays.toString(list.toArray()));

        //値の変更　上書き
        list.set(0,0);//要素の内容を0にする
        System.out.println(Arrays.toString(list.toArray()));

        //クリア 中の要素を全部消す
        list.clear();
        System.out.println(Arrays.toString(list.toArray()));

        //サイズの取得
        System.out.println(list.size());//0

        //空かどうか？　空っぽなら true
        System.out.println(list.isEmpty());//true


    }
}
