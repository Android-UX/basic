package objectSample.abstractSample;

public class HumanSample {

    public static void main(String[] args) {
        //４クラスをまとめるためのHuman型　抽象クラスの理由
        Human[] humans = {
                new American("Tom"),
                new Japanese("しおり"),
                new Chinese("銭琳"),
                new French("Marie-Antoinette")
        };

        for (Human human : humans) {
            human.hello();
        }
    }
}
