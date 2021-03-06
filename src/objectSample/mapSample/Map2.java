package objectSample.mapSample;

import java.util.*;

//Map活用法　Keyで検索ができるデータ構造　Map2が本題　Arrayリストが一番重要　次にMap 次がset
class Map2 {
    //List→Map　メンバーのリストをもらう　変換して返却　入力　加工　出力だけ
    public static Map<String,Member> toMap(List<Member> member){
        Map<String,Member> memberMap = new HashMap<>();
        for (Member m:member) {
            memberMap.put(m.getId(),m);
        }
        return memberMap;
    }

    public static void main(String[] args) {
        //MemberのArrayListを作成する　ハッシュのように一発で見つけられない　先頭から見つける
        List<Member> member = new ArrayList<>();
        member.addAll(Arrays.asList(
                new Member("1","優樹"),
                new Member("2","瑠々"),
                new Member("3","あさ美")
        ));
        //一覧
        System.out.println(member);

        //変換
        Map<String,Member> map = Map2.toMap(member);
        System.out.println(map);

        //検索
        String key = "1";
        if (map.containsKey(key)) {
            //存在している
            System.out.println(map.get(key));
        }else{
            System.out.println("key:" + key + "は見つかりません");
        }
    }
}
