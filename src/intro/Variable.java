package intro;

//変数の宣言の仕方　同じクラス内で同じ変数は使えない　{}変数名の有効範囲（スコープ）は同一ブロック内　識別できないから　全部小文字
public class Variable {
    public static void main(String[] args) {
        //整数型
        byte b = 10;//=は代入演算子　代入は右から左 byte型変数bに10を代入する
        short s = 32000;
        int i = 100;
        long l = 10000;

        //浮動小数点型 longとdoubleとfloatが後ろに文字をつけられる　floatはfを入れないと動かない
        float f = 12.34f;
        double d = 123.456;

        //文字型 ""は文字列（string）　文字は一文字
        char c1 = 'A';


        //真偽値型
        boolean bool = true; //true or false　分岐命令　条件がYesかNo　どっちか一つ

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);

        System.out.println(f);
        System.out.println(d);

        System.out.println(c1);

        System.out.println(bool);
    }
}
