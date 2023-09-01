import java.util.Scanner;
public class Arrays {
    static int Sumrec(int[] arr , int n) {
        int result = 0;
        int i;
        int x = 0;
        for (i = 0; i < n; i++) {
            x = (int) Math.pow(10, n - i);
            result = x + arr[i];
        }
        return result+1;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=s.nextInt();
        }
        int result=Sumrec(arr,n);
        System.out.println(result);
    }
}
