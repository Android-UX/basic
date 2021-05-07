package objectSample.mapSample;

import java.util.HashMap;
import java.util.Map;

//Mapサンプル
class Map1 {
    public static void main(String[] args) {
        Map<String,String>map = new HashMap<>();

        //値の追加
        map.put("Apple","りんご");
        map.put("Banana","バナナ");
        map.put("Orange","オレンジ");
        //一覧の表示
        System.out.println(map);//keyはsetだから順番は保証されない
        //for命令での表示
        //データを取得する変数 entry
        //データ型はMap.Entry<String,String>
        //entrySet()はひとつの組み合わせを取り出す　for文で一対ずつ取り出している
        for (Map.Entry<String,String> entry:map.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
