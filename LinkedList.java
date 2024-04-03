public class LinkedList {
    private Node headNode;

    public void addHeadNode(int x, int y){
        Node newNode = new Node(x, y);
        newNode.nextNode = headNode;
        headNode = newNode;
    }
    public Node removeHeadNode(){
        Node tempNode = headNode;
        if(headNode!=null) {
            headNode = headNode.nextNode;
        }
        return tempNode;
    }
    public Node getHeadNode(){
        return headNode;
    }
}
