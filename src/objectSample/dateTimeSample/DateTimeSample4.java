package objectSample.dateTimeSample;

import java.time.LocalDateTime;

//P279
class DateTimeSample4 {
    public static void main(String[] args) {
        //日付の計算
        LocalDateTime now = LocalDateTime.now();

        //加算
        System.out.println(now);
        System.out.println(now.plusYears(1));//1年後
        System.out.println(now.plusMonths(1));
        System.out.println(now.plusWeeks(1));
        System.out.println(now.plusDays(1));//ECサイト　注文を受けてからどれくらいで配達できるか？　何日後に到着予定
        System.out.println(now.plusHours(1));//日時指定　午前中とか10時から12時までとか
        System.out.println(now.plusMinutes(3));//デリバリー　注文の受付　現在だったら30分-1時間以内　配達予想の時刻とか
        System.out.println(now.plusSeconds(5));
        System.out.println(now.plusNanos(2));

        //値を調整　イミュータブルだから値の変更ができない　調整して新しいインスタンスを作っている
        System.out.println(now.withYear(3000));//　年の部分だけどの値に変更しますか？　
        System.out.println(now.withMonth(8));//int型　整数のみ
        System.out.println(now.withDayOfMonth(5));//月の日にち
        System.out.println(now.withHour(20));
        System.out.println(now.withMinute(30));
        System.out.println(now.withSecond(10));
        System.out.println(now.withNano(0));
    }
}
