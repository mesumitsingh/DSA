public class DoublyLinkedList {

    Node head;
    private int size;

    DoublyLinkedList() {
        this.size = 0;
    }

    class Node {
        String data;
        Node next;
        Node prev;

        Node(String data) {
            this.data = data;
            this.next = null;
            this.prev = null;
            size++;
        }
    }

    // add - first
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // add - last
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
        newNode.prev = currNode;
    }

    // print - forward
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node currNode = head;
        System.out.print("Forward: ");
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    // print - reverse
    public void printListReverse() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }

        System.out.print("Reverse: ");
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.prev;
        }
        System.out.println("NULL");
    }

    // delete first
    public void deleteFirst() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        size--;
        if (head.next == null) { // Only one element
            head = null;
            return;
        }
        head = head.next;
        head.prev = null;
    }

    // delete last
    public void deleteLast() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        size--;
        if (head.next == null) { // Only one element
            head = null;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.prev.next = null;
    }

    public int getSize() {
        return size;
    }

    public static void main(String args[]) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();

        list.addLast("list");
        list.printList();

        list.addFirst("this");
        list.printList();

        list.printListReverse();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        System.out.println("Size: " + list.getSize());
    }
}
