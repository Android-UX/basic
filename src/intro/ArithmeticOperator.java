package intro;

//算術演算子 ()は先に計算する
public class ArithmeticOperator {
    public static void main(String[] args) {
        int a = 5, b = 3;
        System.out.println(a + "+" + b + "=" + (a+b));//8
        System.out.println(a + "-" + b + "=" + (a-b));//2
        System.out.println(a + "*" + b + "=" + (a*b));//15
        System.out.println(a + "/" + b + "=" + (a/b));//1
        System.out.println(a + "%" + b + "=" + (a%b));//2
        System.out.println(a + b);

        double c = 5,d = 3;
        System.out.println(c + "+" + d + "=" + (c+d));//8.0
        System.out.println(c + "-" + d + "=" + (c-d));//2.0
        System.out.println(c + "*" + d + "=" + (c*d));//15.0
        System.out.println(c + "/" + d + "=" + (c/d));//1.6666666666666667
        System.out.println(c + "%" + d + "=" + (c%d));//2.0
    }
}
