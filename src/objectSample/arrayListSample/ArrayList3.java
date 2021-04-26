package objectSample.arrayListSample;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class ArrayList3 {
    public static void main(String[] args) {
        List<Sample> sample = new ArrayList<>();
        sample.add(new Sample("さゆみ",31));
        sample.add(new Sample("愛",34));
        sample.add(new Sample("絵里",32));
        //初期
        System.out.println(sample);

        //年齢でソート
        sample.sort(Comparator.comparing(Sample::getAge));//昇順
        System.out.println(sample);

        sample.sort(Comparator.comparing(Sample::getAge, Comparator.reverseOrder()));//降順
        System.out.println(sample);

        //名前でソート
        sample.sort(Comparator.comparing(Sample::getName));//昇順
        System.out.println(sample);

        sample.sort(Comparator.comparing(Sample::getName, Comparator.reverseOrder()));//降順
        System.out.println(sample);
    }
}
