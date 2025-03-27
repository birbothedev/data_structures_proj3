package proj3;

public class Node {
    int nodeData;
    Node nextNode;

    public Node(){

    }
    public Node(int nodeData){
        // store the node data and have a reference to the next node
        this.nodeData = nodeData;
        this.nextNode = null;
    }
}
