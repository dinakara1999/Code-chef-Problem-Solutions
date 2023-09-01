import java.util.Scanner;

public class ChefDolls {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = 4;
        int m=0;
        int arr[] = new int[n];
        for (int l=0;l<n-1;l++)
        {
            arr[l]=s.nextInt();
        }
        for (int i = 0;i<n-1;i++) {
            for (int j = 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    k += arr[i];
                } else
                    m= arr[j];
            }
        }
        System.out.println(m);
    }
}
