package objectSample.mapSample;

import java.util.HashMap;
import java.util.Map;

//Mapサンプル　p134 値を対にして組み合わせる
class Map1 {
    public static void main(String[] args) {
        Map<String,String>map = new HashMap<>();

        //値の追加　Keyをインデックスとして検索できる　文字も検索できる　データベースに近い構造
        map.put("Apple","りんご");
        map.put("Banana","バナナ");
        map.put("Orange","オレンジ");
        //一覧の表示
        System.out.println(map);//keyはsetだから順番は保証されない
        //for命令での表示　拡張for文は大事　検索結果の一覧表示できる
        //データを取得する変数 entry
        //データ型はMap.Entry<String,String>
        //entrySet()はひとつの組み合わせを取り出す　for文で一対ずつ取り出している
        for (Map.Entry<String,String> entry:map.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());

            //keyを指定して取得
            System.out.println(map.get("Apple"));//りんご
            System.out.println(map.get("abc"));//存在しなければnull

            //Keyが存在することを確認してからgetする　検索のために使う　データベースみたいな使い方
            if (map.containsKey("Apple")) {
                System.out.println(map.get("Apple"));
            }else {
                System.out.println("Key:Appleは存在しません");
            }

            //値の存在を調べる
            String word = "りんご";
            if (map.containsValue((word))) {
                System.out.println(word + "は存在します");
            }else {
                System.out.println(word + "は存在しません");
            }
        }

        //値の変更
        System.out.println(map);
        System.out.println(map.put("Apple", "リンゴ"));//以前の値を返す
        System.out.println(map);

        //Keyの集合を取得 Keyはset構造
        System.out.println(map.keySet());//[Apple, Orange, Banana]

        //値のコレクションを取得 Listインターフェースで返ってくる
        System.out.println(map.values());

        //Keyを指定して値の削除
        String key = "Apple";
        if (map.containsKey(key)) {
            map.remove(key);
        }
        System.out.println(map);
    }//データの追加・修正・削除の３つができればいい
}
