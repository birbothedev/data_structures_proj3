package proj3;

// Gina Fender
// Project 3
// CIS 2353
// Winter 2025
// Prof. John P. Baugh

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
