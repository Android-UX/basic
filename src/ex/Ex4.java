package ex;

//九九の表示
public class Ex4 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(i + "*" + j + "=" + (i*j) + " ");//内側のループの方が先に変わる　終わってから外側　Zの形　行を読んでから列に行く
            }
        }
        System.out.println();//改行
    }
}
