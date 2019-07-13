class RemoveDuplicatesLinkedList {

    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    void removeDuplicates(Node node) {
        Node currentp = node;
        Node nextp = node;
        while (currentp != null && currentp.next != null) {
            if (currentp.data == currentp.next.data) {
                nextp = currentp.next.next;
            }
            if (nextp == null) {
                currentp.next = null;
                break;
            }
            currentp.next = nextp;
            if (currentp.data != currentp.next.data) {
                currentp = currentp.next;
            }
        }

    }

    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + "->");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        RemoveDuplicatesLinkedList.head = new Node(10);
        RemoveDuplicatesLinkedList.head.next = new Node(10);
        RemoveDuplicatesLinkedList.head.next.next = new Node(20);
        RemoveDuplicatesLinkedList.head.next.next.next = new Node(20);
        RemoveDuplicatesLinkedList.head.next.next.next.next = new Node(20);
        RemoveDuplicatesLinkedList.head.next.next.next.next.next = new Node(30);
        RemoveDuplicatesLinkedList removeduplicates = new RemoveDuplicatesLinkedList();
        removeduplicates.printList(head);
        removeduplicates.removeDuplicates(head);
        System.out.println("====================================");
        removeduplicates.printList(head);
    }
}