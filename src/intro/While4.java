package intro;

public class While4 {
    public static void main(String[] args) {
        int[] array = {20, 30, 10, 50, 40};//配列の宣言
        int sum = 0;//合計値の初期化
        int i = 0;//indexの初期化
        while (array[i]>=0) {//配列の中身が０以上なら繰り返す
            sum += array[i];//配列の中身を合計値に代入していく
            i++;//配列の中身を一つずつ増やしていく
            if (i >= array.length) break;//配列の長さを越えたら中断する
        }
        System.out.println(sum);
    }
}
