package objectSample.dateTimeSample;


import java.time.LocalDateTime;
import java.time.Month;

class DateTimeSample2 {
    public static void main(String[] args) {
        LocalDateTime someDateTime = LocalDateTime.of(1981, Month.NOVEMBER,25,18,0,0);

        System.out.println(someDateTime.getYear());//1981
        System.out.println(someDateTime.getMonth());//NOVEMBER
        System.out.println(someDateTime.getMonthValue());//11
        System.out.println(someDateTime.getDayOfMonth());//25
        System.out.println(someDateTime.getHour());//18
        System.out.println(someDateTime.getMinute());//0
        System.out.println(someDateTime.getSecond());//0
        System.out.println(someDateTime.getNano());//0
        System.out.println(someDateTime.getDayOfYear());//329　その1年のうちの何日目か？　正月から何日経ってるか
        System.out.println(someDateTime.getDayOfMonth());//25　その月で何日目か？
        System.out.println(someDateTime.getDayOfWeek());//WEDNESDAY その週の何曜日か？
        System.out.println(someDateTime.getDayOfWeek().getValue());//3 1 (月曜日)から7 (日曜日)まで番号付けされます

    }
}
