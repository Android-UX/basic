package intro;

//比較の違い
public class Comparison {
    public static void main(String[] args) {
        //基本型の比較
        int x = 10,y = 10;
        System.out.println(x==y);//true

        //参照型の比較
        Integer ix = new Integer(10);
        Integer iy = new Integer(10);
        System.out.println(ix==iy);//false
        System.out.println(ix.equals(iy));//true　必ず.equalsを使う

    }
}
