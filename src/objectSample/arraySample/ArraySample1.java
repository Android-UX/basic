package objectSample.arraySample;

import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.Arrays;

//配列のサンプル p109 p110の太字のまとめ
class ArraySample1 {
    //配列を引数としたstaticメソッド
    public static int sum(int... array){//可変長引数　柔軟
        int sum = 0;
        for (int value:array){
            sum += value;
        }
        return sum;
    }

    public static void main(String[] args) {
        //配列の宣言
        int[] array1 = new int[10];//サイズのみ指定
        int[] array2 = {1, 2, 3, 4, 5};//初期値も指定
        int[] array3 = new int[]{10, 9, 8, 7, 6};//new宣言と初期化

        System.out.println(Arrays.toString(array1));//配列の中身を綺麗に表示する
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));
        System.out.println(array1);//これは内容が正しく表示されない コンパイルエラーではない
        System.out.println(array1.length);//10　配列の長さ


        //配列を引数に記述する場合
        System.out.println(ArraySample1.sum(array2));//15
        System.out.println(ArraySample1.sum(new int[]{10, 20, 30}));//...arrayの方が柔軟性が高いのであまり使わない
        System.out.println(ArraySample1.sum(10, 20, 30, 40, 50));
    }
}
