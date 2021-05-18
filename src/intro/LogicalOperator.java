package intro;

public class LogicalOperator {
    public static void main(String[] args) {
        boolean t = true, f = false;

        //論理積（AND)
        System.out.println("論理積（AND) " );
        System.out.println("f && f " + (f && f));//false
        System.out.println("t && f " + (t && f));//false
        System.out.println("f && t " + (f && t));//false
        System.out.println("t && t " + (t && t));//true

        //論理和（OR)
        System.out.println("論理和（OR)");
        System.out.println("f || f " + (f || f));//false
        System.out.println("t || f " + (t || f));//true
        System.out.println("f || t " + (f || t));//true
        System.out.println("t || t " + (t || t));//

        //否定(NOT)
        System.out.println("!f " + (!f));//true
        System.out.println("!t " + (!t));//false

        //演算結果は？
        System.out.println(false || !false && true);
        //否定 NOT>論理積 AND>論理和 OR　の順番

        //xが0以上で100以下でTrue 0未満で100を越えるものを出す
        int x = -1;
        System.out.println(x >= 0 && x <= 100 );
        //0未満もしくは100越える
        System.out.println(x < 0 || x >100);

    }
}
