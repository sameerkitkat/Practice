class PalindromeLinkedList {

    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }

    }

    boolean isPalindrome(Node node) {
        int count = 0;
        boolean flag = false;
        Node current = node;
        Node first = node;
        while (current.next != null) {
            current = current.next;
            count++;
        }
        int i = 0, j = count;
        while (i < j) {
            if (first.data != current.data) {
                return flag;
            }
            i++;
            j--;
        }
        return true;
    }

    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + "->");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        PalindromeLinkedList linkedlist = new PalindromeLinkedList();
        PalindromeLinkedList.head = new Node(10);
        PalindromeLinkedList.head.next = new Node(20);
        PalindromeLinkedList.head.next.next = new Node(30);
        PalindromeLinkedList.head.next.next.next = new Node(20);
        PalindromeLinkedList.head.next.next.next.next = new Node(10);
        linkedlist.printList(head);
        System.out.println(linkedlist.isPalindrome(head));
    }
}