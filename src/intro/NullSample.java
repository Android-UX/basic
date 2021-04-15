package intro;

//Nullの例外処理を発生させる
public class NullSample {
    public static void main(String[] args) {
        String str = null;//null
        System.out.println(str.length());//NullPointerException　実行時例外　文法にエラーはないので実行はできる
    }
}
