package objectSample.exceptionSample.original;

//入力されるデータを格納するクラス
class Data {
    private String name;
    private Gender gender;//列挙型のジェンダー
    private int age;//９章をやった後に誕生日の日付型にする

    public Data(String name, Gender gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d",name,gender.getName(),age);
    }
}
