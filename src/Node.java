

public class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class SinglyLinkedList {
    public Node head;

    public SinglyLinkedList() {
        this.head = null;
    }
    public void insertAtEnd(Node newNode){
        if (head==null){
            head=newNode;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }

    }
    public void print(){
        if(head!=null){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data + "-->");
                temp=temp.next;
            }
            System.out.println();
        }
    }
    public void insertAtBegin(Node newNode){
        newNode.next=head;
        head=newNode;
    }
}
class Main{
    public static void main(String[] args) {
        SinglyLinkedList list=new
                SinglyLinkedList();
        list.insertAtEnd(new Node(4));
        list.insertAtEnd(new Node(7));
        list.print();
        list.insertAtBegin(new Node(9));
        list.print();

    }
}

