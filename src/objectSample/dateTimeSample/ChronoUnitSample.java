package objectSample.dateTimeSample;

import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

class ChronoUnitSample {
    public static void main(String[] args) {
        //経過時間のサンプル　生まれてから何秒経ったか
        LocalDateTime birthDay = LocalDateTime.of(1992,8,3,18,0,0);
        NumberFormat numberFormat = NumberFormat.getNumberInstance();

        System.out.println(numberFormat.format(ChronoUnit.SECONDS.between(birthDay, LocalDateTime.now())) + "秒");
        System.out.println(numberFormat.format(ChronoUnit.MINUTES.between(birthDay, LocalDateTime.now())) + "分");
        System.out.println(numberFormat.format(ChronoUnit.HOURS.between(birthDay, LocalDateTime.now())) + "時間");
        System.out.println(numberFormat.format(ChronoUnit.DAYS.between(birthDay, LocalDateTime.now())) + "日");
        System.out.println(numberFormat.format(ChronoUnit.WEEKS.between(birthDay, LocalDateTime.now())) + "週");
        System.out.println(numberFormat.format(ChronoUnit.MONTHS.between(birthDay, LocalDateTime.now())) + "月");
        System.out.println(numberFormat.format(ChronoUnit.YEARS.between(birthDay, LocalDateTime.now())) + "年");
    }
}