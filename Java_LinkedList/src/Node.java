public class Node {

    private int element;
    private Node next;

    public Node(int element) {
        this.element = element;
        this.next = null;
    }
    

    public Node (int element, Node next) {
        this.element = element;
        this.next = next;
    }

    public int getElement() {
        return element;
    }
    public void setElement(int element) {
        this.element = element;
    }

    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Node {");
        sb.append("element= ").append(element);
        sb.append(", next= ").append(next);
        sb.append('}');
        return sb.toString();
    }
    
}
