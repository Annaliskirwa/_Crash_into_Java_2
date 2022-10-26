public class Node {
    private UserLogin data;
    private  Node next;

//    constructor

    public Node(UserLogin data) {
        this.data = data;
        this.next = null;
    }
//getter and setter
    public UserLogin getData() {
        return data;
    }

    public void setData(UserLogin data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
