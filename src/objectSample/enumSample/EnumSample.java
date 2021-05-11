package objectSample.enumSample;

class EnumSample {
    //三色のどれかを判断して表示する
    public static void viewColor(Color color){
        switch (color){
            case RED:
                System.out.println("赤");
                break;
            case BLUE:
                System.out.println("青");
                break;
            case YELLOW:
                System.out.println("黄");
                break;
        }
    }
    public static void main(String[] args) {
        //列挙型を表示してみる　引数とかコンストラクタの引数にある
        System.out.println(Color.RED);
        viewColor(Color.YELLOW);//受け渡すデータに制約を課すことができる　3種類だけ　絶対に正しい値しか入れられないようにする　他を省く
    }
}
