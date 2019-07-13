class ReverseLinkedList {

    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    Node reverseLinkedList(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + "->");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        ReverseLinkedList.head = new Node(10);
        ReverseLinkedList.head.next = new Node(20);
        ReverseLinkedList.head.next.next = new Node(30);
        ReverseLinkedList.head.next.next.next = new Node(40);
        ReverseLinkedList.head.next.next.next.next = new Node(50);
        ReverseLinkedList reverselist = new ReverseLinkedList();
        reverselist.printList(head);
        head = reverselist.reverseLinkedList(head);
        System.out.println("---------------");
        reverselist.printList(head);
    }
}