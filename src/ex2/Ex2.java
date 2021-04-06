package ex2;

//BMI ＝ 体重kg ÷ (身長m)2
public class Ex2 {
    public static void main(String[] args) {

        //weightは体重
        double weight = 75;
        //heightは身長
        double height = 1.89;

        System.out.println("阿部寛の身長は189cmで体重は75kgでBMIは" + (weight / (height*height)) + "です。");
        //適正体重 ＝ (身長m)2 ×22
        System.out.println("阿部寛の適正体重は"+ ((height*height)*22) + "です。");

    }



}
