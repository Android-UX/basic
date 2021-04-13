package ex;

public class Ex6 {
    public static void main(String[] args) {
        int[] array = {89, 102, 300, 50, 0};
        //100以上のデータの個数を数える
        int cnt = 0;//カウントの初期化　データを入れる箱を用意する　変数の宣言

        for (int value:array) {
            if (value>=100) cnt++;//100以上ならカウントする
            }

            System.out.println("100以上のデータの個数:" + cnt);
        }
    }

