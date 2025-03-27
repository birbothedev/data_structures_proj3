package proj3;

public class ChangeStack {

    Node topNode;
    private int numElements;


    public ChangeStack(){
        // initialize numElements to 0 and set the top of the stack to null
        this.numElements = 0;
        this.topNode = null;
    }

    public void push(int item){
        // instantiate item as an object of node class
        Node node = new Node(item);
        // add integer to the top of the stack
        node.nextNode = topNode;
        topNode = node;

        //increase number of elements in the stack
        numElements++;
    }
    public int pop() throws CustomException {
        // check if stack is empty using custom exception
        if (topNode == null){
            throw new CustomException("Stack is empty.");
        }
        // save the current node data to prevent null exception
        int data = topNode.nodeData;
        // set the next node as the new top node
        topNode = topNode.nextNode;
        // decrease number of elements in the stack
        numElements--;
        // return data for the new top node
        return data;
    }

    public int peekTop() throws CustomException{
        // check if stack is empty using custom exception
        if (topNode == null){
            throw new CustomException("Stack is empty.");
        }
        // return integer data for the top node
        return topNode.nodeData;
    }

    public void increaseValues(int k, int amount){
        // if stack is empty do nothing
        if (topNode == null){
            return;
        }
        Node currentNode = topNode;
        // if there are less than k items in the stack
        if (numElements < k){
            // make sure we don't go past the end of the stack
            while(currentNode != null){
                // modify each node and move onto the next node
                currentNode.nodeData += amount;
                // move to next node
                currentNode = currentNode.nextNode;
            }
        } else {
            // create index for keeping track of where we are in the stack
            int index = 0;
            // create int for keeping track of where the modifying starts in the stack
            int startingPoint = numElements - k;
            // make sure we don't go past the end of the stack
            while (currentNode != null){
                // starting at the top, only get nodes that have a higher index than the starting point
                if(index >= startingPoint) {
                    currentNode.nodeData += amount;
                }
                // move to next node
                currentNode = currentNode.nextNode;
                // increment index
                index++;
            }
        }
    }

    public void decreaseValues(int k, int amount) {
        // same logic as increaseValues but subtracting instead of adding
        if (topNode == null) {
            return;
        }
        Node currentNode = topNode;
        if (numElements < k) {
            while (currentNode != null) {
                currentNode.nodeData -= amount;
                currentNode = currentNode.nextNode;
            }
        } else {
            int index = 0;
            int startingPoint = numElements - k;
            while (currentNode != null) {
                if (index >= startingPoint) {
                    currentNode.nodeData -= amount;
                }
                currentNode = currentNode.nextNode;
                index++;
            }
        }
    }
}
