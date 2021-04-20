package objectSample;

//メソッドの記述
class MethodLib {
    /**　アスタリスクをつけてからコメント　自動的にコメント
     * 整数を２つ加算するメソッド
     * @param x　整数１ int　paramは引数　材料として受け取る
     * @param y　整数２ int　引数
     * @return　整数1 + 整数2 int　戻り値　受け取って足し算をする
     */
    //staticはインスタンスを作らなくてもフィールドを呼び出せる　newとかいらなくなる
    public static int plus(int x, int y){
        return x + y;
    }//メソッド名は動詞

    public static double ave(double[] array){
        double sum = 0.0;
        for (double value:array){
            sum += value;
        }
        return sum / array.length;
    }
}

class MethodSample {
    public static void main(String[] args) {
        int answer = MethodLib.plus(20,30);//50 クラス名.メソッド名　staticSampleや教科書参照
        System.out.println(answer);//50
        System.out.println(MethodLib.plus(10,20));//30
        double[] array = {1,2,3,4,5};
        System.out.println(MethodLib.ave(array));//3.0
    }
}
