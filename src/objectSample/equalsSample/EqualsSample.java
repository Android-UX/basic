package objectSample.equalsSample;

//オブジェクトの比較について
class EqualsSample {
    public static void main(String[] args) {
        Sample sample1 = new Sample("abc");
        Sample sample2 = sample1;
        Sample sample3 = new Sample("def");
        Sample sample4 = new Sample("abc");
        String str = "abc";

        //同一のオブジェクトの場合
        System.out.println(sample1.equals(sample2));//true
        System.out.println(sample1.equals(str));//false
        System.out.println(sample1.equals(sample4));//true
        System.out.println(sample1.equals(sample3));//false
    }
}
