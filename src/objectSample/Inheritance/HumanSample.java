package objectSample.Inheritance;

//継承のサンプル
class HumanSample {
    public static void main(String[] args){
        Human human1 = new Human("Tom");
        human1.hello();//Hello my name is Tom.
        Japanese japanese1 = new Japanese("しおり");
        japanese1.hello();//こんにちは、私の名前はたけしです。
        Chinese chinese1 = new Chinese("銭琳");
        chinese1.hello();//你好!名字叫銭琳。
        French french1 = new French("Marie-Antoinette");
        french1.hello();//Bonjour, je m'appelle Marie-Antoinette.
    }
}
