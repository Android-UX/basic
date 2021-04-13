package intro;

//forを使った配列の処理
public class For2 {
    public static void main(String[] args) {
        int[] array = { 20, 30, 10, 50, 40};//配列の宣言　データの初期化　int[]で配列
        for (int i = 0; i < array.length; i++) { //length　配列の長さ　何個あるのか？　5個
            System.out.println(array[i]);//5未満　0-4
        }
    }
}
