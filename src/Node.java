import java.util.Scanner;

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

    public SinglyLinkedList()
    {
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
//    inserting the value at the beginning of the list
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
            temp=head;
            while (i<middle){
                temp=temp.next;
                i+=1;
            }
            Node newnode=newNode;
            newnode.next=temp.next;
            temp.next=newnode;
        }
    }
//    finding the data of the middle of the list by tortoise method
    public Node findMiddle(){
        if (head==null){
            return null;
        }
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
//    delete the node at beginning of the list
    public void deleteAtBegin(){
        if (head!=null){
            head=head.next;
        }
    }
//    delete the node at the middle of the list
    public void deleteAtMiddle(){
        if(head==null || head.next==null){
            head=null;
            return;
        }
        Node temp=null;
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            temp=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        temp.next=slow.next;
    }

//    delete the node at the end of the list
    public void deleteAtEnd(){
        if (head==null || head.next==null){
            head=null;
        }
        else{
            Node temp=head;
            while(temp.next.next!=null){
                temp=temp.next;
            }
            temp.next=null;
        }
    }
//    searching any value(user input also) in the list
    public boolean search(int data){
        if (head!=null){
            Node temp=head;
            while(temp!=null){
                if (temp.data==data){
                    return true;
                }
                temp=temp.next;
            }
        } return false;
    }
//    inserting the value at nth position
    public void insertAtNthPosition(Node newNode , int n){
        if (head==null){
            head=newNode;
        }
        else if(n==1){
            newNode.next=head;
            head=newNode;
        }
        else{
            Node temp=head;
            while(n-->2 && temp!=null){
                temp=temp.next;
            }
            if (temp!=null){
                newNode.next=temp.next;
                temp.next=newNode;
            } else{
                System.out.println(" List out of range");
            }
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
    
    

    public static void main(String[] args) {
        SinglyLinkedList list=new
                SinglyLinkedList();
        list.insertAtEnd(new Node(4));
        list.insertAtEnd(new Node(7));
        list.insertAtEnd(new Node(686));
        list.insertAtEnd(new Node(98));
        list.print();
        list.insertAtBegin(new Node(9));
        list.print();
        list.insertAtTheMiddle(new Node(99));
        list.print();
        list.deleteAtEnd();
        list.print();
        list.deleteAtBegin();
        list.print();
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the value");
//        int data= sc.nextInt();
//        list.search(data);
//        System.out.println(list.search(data));
        System.out.println(list.findMiddle().data);
        list.deleteAtMiddle();
        list.print();
        list.insertAtNthPosition(new Node(78),2);
        list.print();
    }

    }


