package intro;

public class Continue1 {
    public static void main(String[] args) {
        int[] array = {1,2,-3,4,5};
        //負の数値を発見したらスキップする
        for (int value:array){
            if (value<0) continue;//負の数ならスキップ if文と組み合わせてループから抜け出す　ループの中にifは入る
            System.out.println(value);//1 2 4 5
        }
    }
}
