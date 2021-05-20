package test;

class Test314 {
    public static void main(String[] args) {
        int i = 1, j = 0;
        while (i<=10){
            System.out.println("i:" + i + " j:" + j);
            j += i;
            i++;
        }
        System.out.println(j);
    }
}
