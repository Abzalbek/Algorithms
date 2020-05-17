package LinkedList;


import org.junit.Test;


public class RemoveElement {


    public Node removeElement(Node node, int k) {

        int counter = 1;
        if (node == null) {
            return node;
        }

        // need to be fixed head removing part
        if (k == counter) {
            node = node.next;
            return node;
        }

        Node current = node;
        while (current.next != null) {
            counter++;
            if (k == counter) {
                current.next = current.next.next;
                return node;
            }
            current = current.next;
        }

        return node;
    }

    @Test
    public void test() {

        Helper helper = new Helper();

        Node head = new Node(0);
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(4);

        int k = 2;
        helper.printList(head);
        System.out.println("\n");
        removeElement(head, k);
        helper.printList(head);

    }
}
