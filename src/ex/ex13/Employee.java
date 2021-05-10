package ex.ex13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Employee {
    private int no;
    private String name;
    private String gender;
    private int age;
    private List<Integer> sales = new ArrayList<>(12);

    //イニシャライザ　インスタンスを作成時に実行される　初期化する　12か月分を0で追加する
    {
        sales.addAll(Arrays.asList(0,0,0,0,0,0,0,0,0,0,0,0));
    }

    public Employee(int number, String name, String gender, int age) {
        this.no = number;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public int getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    /**　共同開発者や自分自身のために書いた方がいい
     * 月ごとの売上の取得
     * @param month int 月(1～12)　
     * @return int 指定した月の売上　戻り値
     */
    public int getSales(int month){
        return sales.get(month - 1);
    }

    //追加された
    /**
     * 月を指定して売上をセットする
     * @param month int　指定する月(1～12）
     * @param value value int 指定した月の売上
     */
    public void setSales(int month,int value){
        sales.set(month-1,value);
    }

    @Override
    public String toString() {
        return String.format("%d %s %s %d",
                no,name,gender,age);
    }

    public String getAllSales(){
        List<String> list = new ArrayList<>();
        for (Integer value:sales) {
            list.add(value.toString());
        }
        return String.join(",",list);
    }

    //12ヵ月の売上の合計を求める
    public int getSum(){
        int sum = 0;
        for(int value : sales) {
            sum += value;
        }
        return sum;
    }

    //12ヵ月の売上の平均を求める
    public double getAve() {
        return (double) getSum()/sales.size();
    }
    }




