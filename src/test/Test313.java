package test;

class Test313 {
    public static void main(String[] args) {
        boolean b1 = true,b2 = false;
        System.out.println("(b1&&b2):" + (b1 && b2));
        System.out.println("!(b1&&b2):" + !(b1 && b2));
        System.out.println("!(b1&&b2)||b2" + (!(b1 && b2) || b2));
        if(!(b1&&b2)||b2) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
