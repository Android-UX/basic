package objectSample.cloneSample;

class Node implements Cloneable {
    private String name;

    public Node(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public Node clone() throws CloneNotSupportedException {
        return (Node) super.clone();
    }
}
