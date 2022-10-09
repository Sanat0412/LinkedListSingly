import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class A_Array_Rearrangment {
    public static void main(String[] args ){
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int x= sc.nextInt();
            int[] arr=new int[n];
            int[] brr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++){
                brr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            Arrays.sort(brr);
            int temp=0;
            for (int i = 0; i < brr.length; i++) {
                for (int j = i+1; j < brr.length; j++) {
                    if(arr[i] < arr[j]) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            int count=0;
            for (int i = 0; i < n; i++) {
                if (arr[i]+brr[i]<=x){
                    count++;
                }
            }
            if(count==n){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
