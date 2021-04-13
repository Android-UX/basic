package intro;

import java.util.Scanner;

public class While3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("パスワードを入力してください");
        String str = in.nextLine();//キーボード入力

        while(!"abc".equals(str)){//.equals(str)はメソッド "abc"は定数　必ず最初に書く　必ずあるから
            System.out.println("パスワードが違います");
            str = in.nextLine();
        }
        System.out.println("OK");
    }

}
