package objectSample.exceptionSample;

//例外をスローするメソッドの書き方
class ExceptionSample3 {
    public static int getLength(String word) throws Exception{//throws Exceptionはダメ　具象クラスを書くべき　,で複数の例外を書ける
        try {
            return  word.length();
        }catch (Exception e) {
            throw new Exception("キーワードが異常です");//報告している　exceptionクラスのコンストラクタ
        }
    }
    public static void main(String[] args) {
        //メソッドで検査例外をスローするとtry catchブロックを書く必要がある
        try {
            System.out.println(getLength("abc"));
            System.out.println(getLength(null));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());//例外メッセージの表示
        }
    }
}
