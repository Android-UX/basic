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
        System.out.println(Color.RED);//RED
        viewColor(Color.YELLOW);//受け渡すデータに制約を課すことができる　3種類だけ　絶対に正しい値しか入れられないようにする　他を省く
        System.out.println(Color.BLUE.getJpName());//赤
        System.out.println(Color.RED.name());//RED
        System.out.println(Color.BLUE.ordinal());//1
        Color color = Color.valueOf("YELLOW");//列挙型の取得
        System.out.println(color.getJpName());//黄
        Color[] colors = color.values();//列挙定数の一覧の取得
        for (Color c:colors){
            System.out.println(c);
        }
    }
}
