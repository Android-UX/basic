package objectSample.dateTimeSample;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

//日時の初期化
class DateTimeSample1 {
    //現在日時 p274　ツイッターとかでつぶやく場合
    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();//日付
        LocalTime nowTime = LocalTime.now();//時刻
        LocalDateTime nowDateTime = LocalDateTime.now();//日時
        System.out.println(nowDate);//年　月　日
        System.out.println(nowTime);//時　分　秒　ナノ秒
        System.out.println(nowDateTime);//上の二つを出す

        //任意の日時を指定　直接入力する場合　入力フォームならこれが使いやすい
        LocalDate someDate = LocalDate.of(1981,11,25);
        LocalTime someTime = LocalTime.of(18,0,0);
        LocalDateTime someDateTime = LocalDateTime.of(1981, Month.NOVEMBER,25,18,0,0);
        System.out.println(someDate);
        System.out.println(someTime);
        System.out.println(someDateTime);

        //日付文字列から　ファイルやデータベースから引っ張る
        LocalDate parseDate = LocalDate.parse("2020-01-01");
        LocalTime parseTime = LocalTime.parse("21:00:00");
        LocalDateTime parseDateTime = LocalDateTime.parse("2020-01-01T21:00:00");
        System.out.println(parseDate);
        System.out.println(parseTime);
        System.out.println(parseDateTime);
    }
}
