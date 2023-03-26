package Solutions.week11;

public class DeleteNNodesAfterMNodes {

  public static void main(String[] args) {
    Node head1 = new Node(1);
    Node node1 = new Node(2);
    Node node2 = new Node(3);
    Node node3 = new Node(4);
    Node node4 = new Node(5);
    Node node5 = new Node(6);
    Node node6 = new Node(7);
    head1.next = node1;
    node1.next = node2;
    node2.next = node3;
    node3.next = node4;
    node4.next = node5;
    node5.next = node6;

    head1.print(); // prints: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 ->
    dummySolution(head1, 3,3);//todo call your solution method from here
    head1.print(); // expected result: 1 -> 2 -> 3 -> 7 ->
  }

  static Node dummySolution(Node head, int m, int n) {
    //just for method blueprint
    return null;
  }

  public static void print(Node head) {
    Node current = head;

    while (current != null) {
      System.out.print(current);
      current = current.next;
    }
    System.out.println();
  }
}

class Node {

  public Node next;
  public int value;

  public Node(int value) {
    this.value = value;
  }

  public void print() {
    Node current = this;

    while (current != null) {
      System.out.print(current);
      current = current.next;
    }
    System.out.println();
  }

  @Override
  public String toString() {
    return value + " -> ";
  }
}