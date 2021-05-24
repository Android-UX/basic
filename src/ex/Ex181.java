package ex;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

class Ex181 {
    /**
     * 指定した年月のカレンダーを出力する
     * @param year  西暦 int
     * @param month 月 Month
     */
    static void createCalender(int year, Month month) {
        LocalDate date = LocalDate.of(year,month,1);
        int offset = date.getDayOfWeek().getValue()%7;
        int lengthOfMonth = date.lengthOfMonth();
        int day = 1;
        //System.out.println(String.format("%d %d",offset,lengthOfMonth));
        System.out.println(DateTimeFormatter.ofPattern("yyyy/MM").format(date));
        while (day <= lengthOfMonth) {
            String line = "";
            for (int i = 0; i < 7; i++) {
                if (offset > 0) {
                    line += "   ";
                    offset--;
                } else {
                    line += String.format("%2d ",day);
                    day++;
                    if (day > lengthOfMonth) break;
                }
            }
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        int year = 2021;
        for(Month month:Month.values()) {
            createCalender(year,month);
        }
    }
}
