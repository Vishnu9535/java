public class displayll {
    private static class Node {

        private int data;
        private Node next;
    
        public Node(int data) {
          this.data = data;
        }
    
      }
    
      private Node head;
    
      public void add(int data) {
        Node newNode = new Node(data);
    
        if (head == null) {
          head = newNode;
        } else {
          Node current = head;
    
          while (current.next != null) {
            current = current.next;
          }
    
          current.next = newNode;
        }
      }
    
      public void displayRecursively() {
        if (head == null) {
          return;
        }
    
        System.out.println(head.data);
        displayRecursively(head.next);
      }
    
      private void displayRecursively(Node node) {
        if (node == null) {
          return;
        }
    
        System.out.println(node.data);
        displayRecursively(node.next);
      }
    
      public static void main(String[] args) {
        displayll linkedList = new displayll();
    
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
    
        linkedList.displayRecursively();
      }
    
}
