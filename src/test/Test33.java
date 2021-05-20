package test;

class Test33 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 100; i+=3){//0で初期化　　100未満　3ずつ増える
            if (i%2==0) continue;//2で割ったあまりが０　iが２の倍数だったらスキップ　処理をやめて６行目に元に戻る　偶数だったらやらない
            if (sum>50) break;//50を越えたところでやめる　最後はsumが48だから続けてsum 48に iの27を足してsum=75になる
            sum+=i;
            System.out.println("i:" + i + "sum" + sum);
        }
        System.out.println(sum);
    }
}
