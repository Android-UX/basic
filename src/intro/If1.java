package intro;


import java.time.LocalDateTime;
import java.util.Random;

//分岐命令　if　その１
public class If1 {
    public static void main(String[] args) {
        //奇遇判定
        Random random = new Random(LocalDateTime.now().getSecond());
        int num = random.nextInt(100);
//        int num = 10;
        if (num%2 == 0){
            //偶数　if(条件式) trueだったらif falseだったらelse以降を表記
            System.out.println(num + "は偶数です");
        } else {
            //奇数
            System.out.println(num + "は奇数です");
        }
    }
}
