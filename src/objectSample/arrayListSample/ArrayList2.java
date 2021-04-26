package objectSample.arrayListSample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ArrayList2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("汐里","夢羽","こころ"));
        System.out.println(list);

        //要素の検索
        if (list.contains("夢羽")) {
            //夢羽は存在する
            int index = list.indexOf("夢羽");
            System.out.println(index + ":" + list.get(index));//1:夢羽
        }else {
            System.out.println("not find:夢羽");
        }
    }
}
