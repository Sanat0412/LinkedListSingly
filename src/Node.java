

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
//    inserting the value at the end of the list
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
        } }
//    inserting the value at the begining of the list
    public void insertAtBegin(Node newNode){
        newNode.next=head;
        head=newNode;
    }
//    inserting the value at the middle of the list
    public void insertAtTheMiddle(Node newNode){
        if(head==null){
            head=newNode;
        }
        else if(head.next==null){
            head.next=newNode;
        }
        else{
            Node temp=head;
            int count=0;
            while(temp!=null){
                count+=1;
                temp=temp.next;
            }
            int middle=count/2;
            int i =1;
            while (i<middle){
                temp=temp.next;
                i+=1;
            }
            Node newnode=newNode;
            newnode.next=temp.next;
            temp.next=newnode;
        }
    }
//    for printing the list
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
        list.print();
    }
}

