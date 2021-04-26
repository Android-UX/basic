package objectSample.arraySample;

import java.util.Arrays;

//配列関連のメソッド
//https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/util/Arrays.html
class ArraySample3 {
    public static void main(String[] args) {
        //配列のコピー
        int[] array = {1,2,3,4,5};
        int[] newArray1 = Arrays.copyOf(array, array.length);//そのまま複製
        int[] newArray2 = Arrays.copyOf(array, 3);//{1,2,3}
        int[] newArray3 = Arrays.copyOf(array,10);
        System.out.println(Arrays.toString(newArray1));
        System.out.println(Arrays.toString(newArray2));

        int[] newArray4 = Arrays.copyOfRange(array,1,3);//{2,3}
        System.out.println(Arrays.toString(newArray4));
    }
}
