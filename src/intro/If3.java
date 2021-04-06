package intro;

public class If3 {
    public static void main(String[] args) {
        //多分岐
        //80点以上をA、70点～79点をB、60点～69点をC、その他をD
        int score = 65;

        if (score >= 80) {
            System.out.println(score + ":A");
        } else if (score >= 70) {
            System.out.println(score + ":B");
        } else if (score >= 60) {
            System.out.println(score + ":C");
        } else {
            System.out.println(score + "D");

        }
    }
}
