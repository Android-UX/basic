package ex2;

//BMI ＝ 体重kg ÷ (身長m)2
public class Ex2 {
    public static void main(String[] args) {

//        //weightは体重
//        double weight = 75;
//        //heightは身長
//        double height = 1.89;
//
//        System.out.println("阿部寛の身長は189cmで体重は75kgでBMIは" + (weight / (height*height)) + "です。");
//        //適正体重 ＝ (身長m)2 ×22
//        System.out.println("阿部寛の適正体重は"+ ((height*height)*22) + "です。");

            //初期化
            double height = 170,weight = 65;

            //BMIを求める
//        double bmi = weight / (height/100 * height/100);
            double bmi = Math.round(weight / Math.pow(height/100,2)*100)/100.0;

            //適性体重を求める
//        double appWeight = height/100 * height/100 * 22;
            double appWeight = Math.round(Math.pow(height/100,2) * 22 * 100) / 100.0;

            //判定を求める
            String judgment = "";

            if (bmi >= 40) {
                judgment = "肥満（4度）";
            } else if(bmi >= 35) {
                judgment = "肥満（3度）";
            } else if (bmi >= 30) {
                judgment = "肥満（2度）";
            } else if (bmi >= 25) {
                judgment = "肥満（1度）";
            } else if (bmi >= 18.5) {
                judgment = "普通体重";
            } else {
                judgment = "低体重（瘦せ型）";
            }

            //表示する
            System.out.println(height + "cm "
                    + weight + "kg BMI "
                    + bmi + " 適性体重 "
                    + appWeight + "kg "
                    + judgment);

            //表示する（別解）
            System.out.println(
                    String.format("%.1fcm %.1fkg BMI %.2f 適性体重 %.2fkg %s",
                            height,weight,bmi,appWeight,judgment));
        }

    }




