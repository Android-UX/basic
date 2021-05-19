package objectSample.stringSample;

import java.text.MessageFormat;
import java.text.NumberFormat;

//フォーマットの見本　思い通りの書式に表示するのが目標
class FormatSample {
    public static void main(String[] args) {
        String name = "Tom";
        int age = 29;
        System.out.println(String.format("name:%s age:%d", name, age));

        //printf
        System.out.printf("name:%s age:%d",name,age);

        //MessageFormat
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/text/MessageFormat.html
        System.out.println(MessageFormat.format("name:{0} age:{1}", name, age));

        //NumberFormat
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        System.out.println(nf.format(1234567));

        //寝てる間に追記
        NumberFormat percent = NumberFormat.getPercentInstance();
        System.out.println(percent.format(0.724));
    }
}
