package objectSample.equalsSample;

import java.util.Objects;

//暗黙の継承
class Sample {
    private String keyword;

    public Sample(String keyword) {
        this.keyword = keyword;
    }

    public String getKeyword() {
        return keyword;
    }

    @Override
    //どんな型でも受け入れるObject型クラスで定義する　自分とこの型を比較する
    public boolean equals(Object o) {
        if (this == o) return true;//オブジェクトが同一である
        if (!(o instanceof Sample)) return false;//クラスが異なるので不一致
        Sample sample = (Sample) o;//クラスが一致しているので型変換　Sample型に変換　オブジェクト型にはgetKeywordがないから
        //型変換ののちobjectsクラスのequalsメソッドで比較する　書いてあることが読めるどうかが重要
        return Objects.equals(getKeyword(), sample.getKeyword());
    }

    //先に計算するメソッド
    @Override
    public int hashCode() {
        return Objects.hash(getKeyword());
    }
}
