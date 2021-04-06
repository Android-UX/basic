package ex;

//練習問題
public class Ex1 {
    public static void main(String[] args) {
        int num = 9;//ここは変更して結果を確認


        //3の倍数のとき true　それ以外は falseを表示する
        System.out.println("num:" + num);
        System.out.println("3の倍数か？:" + (num%3 == 0));

        System.out.println( num%3 == 0 && num%3 == 0);
    }
}
