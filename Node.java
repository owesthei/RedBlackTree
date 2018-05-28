public class Node<T extends Comparable<T>> {
    private T data;
    private NodeColor color;
    private Node<T> leftChild;
    private Node<T> rightChild;
    private Node<T> parent;

    public Node(T data) {
        this.data = data;
        this.color = NodeColor.RED;
    }

    @Override
    public String toString() {
        return data.toString();
    }
}