package objectSample.enumSample;


//enumのサンプル 定数を定義しているクラス
enum Color {
    RED("赤"),
    BLUE("青"),
    YELLOW("黄");

    //フィールド
    private String jpName;

    //コンストラクタ
    private Color(String jpName) {
        this.jpName = jpName;
    }

    //ゲッター
    public String getJpName() {
        return jpName;
    }
}
