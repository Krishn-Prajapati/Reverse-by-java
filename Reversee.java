import java.util.*;
class Reversee{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int size=sc.nextInt();
        int arr[]=new  int[size];
        System.out.println("array element are");
        for(int i =0; i<size; i++)
        {
            arr[i]=sc.nextInt();
        }
            System.out.println("reverse is");
            for(int i=size-1; i>=0; i--)
            {
                System.out.println(arr[i]);
            }
        
    }
}