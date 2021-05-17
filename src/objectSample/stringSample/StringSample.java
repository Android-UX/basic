package objectSample.stringSample;

import java.util.Arrays;
import java.util.List;

class StringSample {

    public static void main(String[] args) {
        //文字列の結合
        String str1 = "abc",str2 = "def";
        System.out.println(str1 + str2);//abcdef
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html#concat(java.lang.String)
        System.out.println(str1.concat(str2));//abcdef
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html#join(java.lang.CharSequence,java.lang.CharSequence...)
        System.out.println(String.join("", str1, str2));//abcdef
        List<String> stringList = List.of("a","b","c");
        System.out.println(String.join(",", stringList));//a,b,c

        //文字列の比較
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html#equals(java.lang.Object)
        System.out.println("abc".equals("abc"));//true
        System.out.println("abc".equals("ABC"));//false
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html#compareTo(java.lang.String)
        System.out.println("abc".compareTo("abc"));//0
        System.out.println("abc".compareTo("ABC"));//正の数
        System.out.println("abc".compareTo("xyz"));//負の数
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html#equalsIgnoreCase(java.lang.String)
        System.out.println("abc".equalsIgnoreCase("ABC"));//true

        //文字列の状態検査
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html#isBlank()
        System.out.println("".isBlank());//true
        System.out.println(" ".isBlank());//true
        System.out.println("　".isBlank());//true
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html#isEmpty()
        System.out.println("".isEmpty());//true
        System.out.println(" ".isEmpty());//false
        System.out.println("　".isEmpty());//false

        //指定した文字で始まるかを判定
        System.out.println("ピカチュー".startsWith("ピカ"));//ture
        System.out.println("ピチュー".startsWith("ピカ"));//false

        //指定した文字で終わるかを判定
        System.out.println("あきこ".endsWith("こ"));//true
        System.out.println("ゆかり".endsWith("こ"));//false

        //大文字・小文字の変換
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html#toUpperCase()
        System.out.println("abc".toUpperCase());//ABC
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html#toLowerCase()
        System.out.println("ABC".toLowerCase());//abc

        //前後の空白を取り除く
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html#trim()
        System.out.println(" This is a pen.     ".trim());
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html#strip()
        System.out.println("　This is a pen.　".strip());
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html#stripLeading()
        System.out.println("　This is a pen.　".stripLeading());
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html#stripTrailing()
        System.out.println("　This is a pen.　".stripTrailing());

        //文字列の長さを調べる
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html#length()
        System.out.println("あい123".length());//5
        //サロゲートペアだと長さが倍になる
        System.out.println("𠀋あ𠀋".length());//5
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html#codePointCount(int,int)
        System.out.println("𠀋あ𠀋".codePointCount(0,"𠀋あ𠀋".length()));//3　英語のみならいらない　漢字が多い国は使う


        //文字列を分割する
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html#split(java.lang.String)
        String data = "やながわ,女,20";
        String[] dataArray = data.split(",");//,で分割してオブジェクトのArrayリストに変換する
        System.out.println(Arrays.toString(dataArray));
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html#split(java.lang.String,int)
        System.out.println(Arrays.toString(data.split(",",2)));//結果として入ってくる配列の長さ
        String data2 = "やながわ,女,";
        System.out.println(Arrays.toString(data2.split(",")));
        System.out.println(Arrays.toString(data2.split(",",3)));

        String data3 = "やながわ,女,20,a";
        System.out.println(Arrays.toString(data3.split(",")));
        System.out.println(Arrays.toString(data3.split(",",3)));//joinとsplitは覚えておくといい

    }
}