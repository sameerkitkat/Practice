class LinkedList {
    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + "->");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        LinkedList.head = new Node(10);
        LinkedList.head.next = new Node(20);
        LinkedList.head.next.next = new Node(20);
        LinkedList.head.next.next.next = new Node(10);
        LinkedList list = new LinkedList();
        list.printList(head);
    }
}