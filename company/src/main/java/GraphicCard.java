public class GraphicCard {
    private int size;

    public GraphicCard() {
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "GraphicCard{" +
                "size=" + size +
                '}';
    }
}
