package LinkedList.SinglyLinkedList;
public class RemoveDuplicate extends SinglyLinkedlist {

    //remove duplicates from sorted linked list
    static ArrayList<Integer> downwardDigonal(int n, int A[][])

    {

       ArrayList<Integer>arr=new ArrayList<>();

        for(int i=0;i<n;i++)

        {

             int x=0,y=i;

            while(x<n && y>=0 )

            {

                arr.add(A[x][y]);

                x++;

                y--;

            }

        }

        for(int i=1;i<n;i++)

        {

             int x=i,y=n-1;

            while(x<n && y>=0 )

            {

               arr.add(A[x][y]);

                x++;

                y--;

            }

        }

        return arr;

    }



    public static void main(String[] args) {
        
    }
    
}
