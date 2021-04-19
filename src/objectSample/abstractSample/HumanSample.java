package objectSample.abstractSample;

public class HumanSample {

    public static void main(String[] args) {
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
