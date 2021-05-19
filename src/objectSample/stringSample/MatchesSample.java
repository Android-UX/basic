package objectSample.stringSample;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class MatchesSample {
    public static void main(String[] args) {
        //基本的な正規表現比較
        String sentence1 = "This is a pen.";//検索対象
        String sentence2 = "That is a pen.";//検索対象
        String regex = "This is a .*\\.";//正規表現 this is a までが固定　最後がピリオドで終わるもの
        System.out.println(sentence1.matches(regex));//true
        System.out.println(sentence2.matches(regex));//false

        //繰り返しで正規表現比較をする
        Pattern pattern = Pattern.compile("[A-z]+");//正規表現パターン（英字のみ）Patternオブジェクト作る
        List<String> sentenceList = List.of("apple","1234","cat1","book");

        for (String s:sentenceList) {
            Matcher matcher = pattern.matcher(s);//それぞれの文字列を正規表現比較　Matchesオブジェクト作る
            System.out.println(s + ":" + matcher.matches());//結果表示
        }
    }
}

