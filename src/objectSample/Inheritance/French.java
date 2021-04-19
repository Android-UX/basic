package objectSample.Inheritance;

class French extends Human {
    public French(String name) {
        super(name);
    }

    @Override
    public void hello() {
        System.out.println("Bonjour, je m'appelle " + name + ".");
    }
}
