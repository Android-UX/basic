package objectSample;

class Student {
    //フィールド　データを記憶する場所　情報を保存
    private String name;
    private int grade;
    private int cl;
    private int no;

    //コンストラクタ　インスタンスを作る時に使用される専用のメソッド

    public Student(String name, int grade, int cl, int no) {
        this.name = name;
        this.grade = grade;
        this.cl = cl;
        this.no = no;
    }



    //ゲッター　データを取得するメソッド
    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getCl() {
        return cl;
    }

    public int getNo() {
        return no;
    }

    //toString 文字列に変換？
    @Override
    public String toString() {
        return String.format("%s %d %d %2d",
                name,grade,cl,no);
    }
}
