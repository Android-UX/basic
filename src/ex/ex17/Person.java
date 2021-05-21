package ex.ex17;

import objectSample.exceptionSample.original.Gender;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

//フィールドの設計　どんなデータが必要か列挙する　そのクラス自身が誕生日を計算する mainじゃ結びつきが
class Person {
    private String name;
    private Gender gender;
    private LocalDate birth;

    /*
        コンストラクタに与えるデータ形式
        名前 name 文字列
        性別 gender 列挙型 Gender
        誕生日 LocalDate 引数はISO文字列 文字型 2005-02-15
     */

    /**
     * コンストラクタ　インスタンスを作るためのメソッド
     * @param name 名前 String
     * @param gender 性別 Gender
     * @param birth 誕生日 String
     */
    public Person(String name, Gender gender, String birth) {
        this.name = name;
        this.gender = gender;
        this.birth = LocalDate.parse(birth);
    }
    /*
        getter　get欲しいもの
        名前は文字列で、性別は「男 or 女」
        誕生日は 2005/02/15
        getAge()は年齢を取得できる 16
     */

    /**
     * 名前を取得する
     * @return 名前 String
     */
    public String getName() {
        return name;
    }

    /**
     * 性別の文字列を取得する
     * @return 性別 String
     */
    public String getGender() {
        return gender.getName();
    }

    /**
     * 誕生日のyyyy/MM/dd形式の文字列を取得する　DateTimeSample5
     * @return 誕生日のyyyy/MM/dd形式の文字列 String
     */
    public String getBirth() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        return formatter.format(birth);
    }

    /**
     * 年齢を所得する　インターフェースの知識が必要になる
     * @return 年齢 Long
     */
    public Long getAge() {
        return ChronoUnit.YEARS.between(birth, LocalDateTime.now());
    }

    /**
     * Personの文字列表現
     * @return 文字列表現 "やまだ 男 2005/02/15 16" String
     */
    @Override
    public String toString() {
        return String.format("%s %s %s %d",
                getName(),getGender(),getBirth(),getAge());
    }
}
