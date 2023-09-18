public class Node {
    private Node next;
    private Integer vtx;
    private Float weight;

    public Node (Integer vtx, Float weight) {
        this.next = null;
        this.vtx = vtx;
        this.weight = weight;
    }
}
