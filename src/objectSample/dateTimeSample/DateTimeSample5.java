package objectSample.dateTimeSample;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

//p285
class DateTimeSample5 {
    public static void main(String[] args) {
      //日付の表示フォーマットを作成する
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/time/format/DateTimeFormatter.html
        LocalDateTime now = LocalDateTime.now();
        System.out.println(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss.SSS").format(now));
        //DateTimeFormatter.ofPatternで自分で独自書式を作って.formatメソッドで(now)日付メソッドのインスタンスを与える
        // 定義済みも使える

        //書式を指定して文字列から日付に変換する
        TemporalAccessor parsed = DateTimeFormatter
                .ofPattern("yyyy/MM/dd")
                .parse("2021/01/01");
        //.ISO_LOCAL_DATE.parse("2021-01-01");
        LocalDate date = LocalDate.from(parsed);
        System.out.println(date);

    }
}
