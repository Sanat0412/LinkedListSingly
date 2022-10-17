import java.util.Scanner;

public class A_Odd_Set {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n= sc.nextInt();
            int o=0;
            int e=0;
            for (int i = 0; i < 2*n; i++) {
                int a= sc.nextInt();
                if (a==1)
                    o+=1;
                else if(a%2==0)
                    e+=1;
                else
                    o+=1;
            }
            if (o==e){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }
    }
}
