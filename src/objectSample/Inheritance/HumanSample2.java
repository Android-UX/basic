package objectSample.Inheritance;

//スーパークラスとサブクラス　継承の目的　内容の変更（オーバーライド）と追加　多態性　メソッドの内容を変更すること　メソッドでふるまいが違う　継承3回目のテスト
public class HumanSample2 {
    public static void main(String[] args) {
        Human[] humans = {
                new Human("Tom"),
                new Japanese("しおり"),
                new Chinese("銭琳"),
                new French("Marie-Antoinette")
        };
        for (Human human : humans) {
            human.hello();
        }
    }
}
