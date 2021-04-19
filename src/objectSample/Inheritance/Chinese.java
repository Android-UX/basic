package objectSample.Inheritance;

class Chinese extends Human {
public Chinese(String name){
    super(name);
}

@Override
    public void hello(){
    System.out.println("你好!名字叫" + name + "。");
}
}
