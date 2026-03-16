
import java.util.*;

class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

}

class insert_at_beg {

    public static Node insertAtEnd(Node head, int data) {
        Node newnode = new Node(data);
        Node temp = head;
        if (head == null) {
            head = newnode;
            return head;
        }
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
        return head;
    }

    public static Node addAtBeg(Node head, int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return head;
        }
        newnode.next = head;
        head = newnode;
        return head;
    }

    public static Node add_pos(Node head, int data, int pos) {
        Node newnode = new Node(data);
        Node temp = head;
        Node prev = null;
        if (pos < 1) {
            System.out.println("invalid operation");
            return head;
        }
        if (head == null) {
            if (pos > 1) {
                System.out.println("out of bound position");
                return head;
            } else {
                System.out.println(newnode.data + " is added at position 1");
                head = newnode;
                return head;
            }

        }
        if (pos == 1) {
            System.out.println(newnode.data + " is added at position 1");
            newnode.next = head;
            head = newnode;
            return head;
        }
        for (int i = 1; i < pos; i++) {
            if (temp.next == null) {
                System.out.println("position out of bound");
                return head;
            }
            prev = temp;
            temp = temp.next;
        }
        prev.next = newnode;
        newnode.next = temp;
        System.out.println(newnode.data + " is added at position " + pos);
        return head;
    }

    public static Node remove_beg(Node head) {
        if (head == null) {
            System.out.println("the list is already empty");
            return null;
        }
        System.out.println(head.data + " is removed");
        Node temp = head.next;
        head.next = null;
        head = temp;
        return head;
    }

    public static Node remove_end(Node head) {
        if (head == null) {
            System.out.println("the list is already empty");
            return null;
        }
        Node temp = head;
        if (temp.next == null) {
            System.out.println(temp.data + " is removed");
            head = null;
            return head;
        }
        Node temp1 = temp.next;
        while (temp1.next != null) {
            temp = temp.next;
            temp1 = temp.next;
        }
        System.out.println(temp1.data + " is removed");
        temp.next = null;
        return head;
    }

    public static Node remove_pos(Node head, int pos) {
        Node temp = head;
        if (head == null) {
            System.out.println("the list is empty ");
            return null;
        }
        if (pos < 1) {
            System.out.println("invalid operation");
            return head;
        }
        if (pos == 1) {
            System.out.println(head.data + " is removed");
            head = head.next;
            return head;
        }
        Node prev = null;
        for (int i = 1; i < pos; i++) {
            if (temp.next == null) {  // Prevent going beyond list end
                System.out.println("Position out of bounds");
                return head;
            }
            prev = temp;
            temp = temp.next;
        }
        System.out.println(temp.data + " is removed");
        prev.next = temp.next;
        return head;
    }

    public static void count(Node head) {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.print("the number of elements in the list is: " + count);
        System.out.println("");
    }

    public static void display(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String args[]) {
        Node head = null;

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("");
            System.out.println("1.insert at end");
            System.out.println("2:insert at beginning");
            System.out.println("3:insert at any position");
            System.out.println("4:remove from beginning");
            System.out.println("5:remove from end");
            System.out.println("6:remove at any position");
            System.out.println("7.display");
            System.out.println("8.count");
            System.out.println("9:exit");
            System.out.println("###################################################");
            System.out.println("");
            System.out.print("enter an option:");
            int choice = sc.nextInt();
            System.out.println("");

            switch (choice) {
                case 1:
                    System.out.print("enter data to be entered at the end:");
                    int n1 = sc.nextInt();
                    head = insertAtEnd(head, n1);
                    break;
                case 2:
                    System.out.print("enter data to be entered at the beginning:");
                    n1 = sc.nextInt();
                    head = addAtBeg(head, n1);
                    break;
                case 3:
                    System.out.print("Enter data :");
                    n1 = sc.nextInt();
                    System.out.print("Enter positon :");
                    int pos = sc.nextInt();
                    head = add_pos(head, n1, pos);
                    break;
                case 4:
                    head = remove_beg(head);
                    break;
                case 5:
                    head = remove_end(head);
                    break;
                case 6:
                    System.out.print("enter position:");
                    pos = sc.nextInt();
                    head = remove_pos(head, pos);
                    break;
                case 7:
                    display(head);
                    break;
                case 8:
                    count(head);
                    break;
                case 9:
                    System.exit(0);

                default:
                    System.out.println("enter a valid option");
                    break;
            }
        }

    }
}
