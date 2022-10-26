public class UserLoginLinkedList {
    private Node head;

    //    getter
    public Node getFirst() {
        return head;
    }

    public UserLoginLinkedList() {
    }

    public void add(UserLogin userLogin) {
        Node node = new Node(userLogin);
        if (head == null) {
            head = node;
        } else {
            Node current = head;
            Node previous = null;
            while (current != null) {
                previous = current;
                current = current.getNext();
            }
            previous.setNext(node);
            ;
        }
    }

    public UserLogin searchIndex(int index) {
        if (index < 0) {
            return null;
        }
        int count = 0;
        Node current = head;
        while (current != null) {
            if (count == index) {
                break;
            }
            current = current.getNext();
            count++;
        }
        if (current != null) {
            return current.getData();
        }
        ;
        return null;
    }

    //    overload
    public UserLogin searchIndex(Long id) {
        Node current = head;
        while (current != null) {
            if (current.getData().getId().equals(id)) {
                return current.getData();
            }
            current= current.getNext();
        }
        return null;
    }

    public UserLogin searchIndex(String username) {
        Node current = head;
        while (current != null) {
            if (current.getData().getName().equalsIgnoreCase(username)) {
                return current.getData();
            }
            current= current.getNext();
        }
        return null;
    }
}
