public class CircularLinkedList {

    Node head;
    Node tail;
    private int size;

    CircularLinkedList() {
        this.size = 0;
    }

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // Add to the end of the list
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head; // Circular link
            return;
        }
        tail.next = newNode;
        tail = newNode;
        tail.next = head; // Circular link
    }

    // Add to the beginning of the list
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head; // Circular link
            return;
        }
        newNode.next = head;
        head = newNode;
        tail.next = head; // Circular link
    }

    // Print the list
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node currNode = head;
        System.out.print("Circular Linked List: ");
        do {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        } while (currNode != head); // Stop when we circle back to head
        System.out.println("(back to head)");
    }

    // Delete the first node
    public void deleteFirst() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        size--;
        if (head == tail) { // Single node case
            head = null;
            tail = null;
            return;
        }
        head = head.next;
        tail.next = head; // Maintain circular link
    }

    // Delete the last node
    public void deleteLast() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        size--;
        if (head == tail) { // Single node case
            head = null;b
            tail = null;
            return;
        }
        Node currNode = head;
        while (currNode.next != tail) {
            currNode = currNode.next;
        }
        currNode.next = head; // Maintain circular link
        tail = currNode;
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.printList();

        list.addFirst(0);
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        System.out.println("Size of the list: " + list.getSize());
    }
}
