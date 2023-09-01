import java.util.Scanner;

public class BothHands {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        int J = s.nextInt();
        int K = s.nextInt();
        if (K % i != 0) {
            int results = calculations(i, J, K);
            System.out.println(results + 1);
        } else {
            int results = calculations(i, J, K);
            System.out.println(results);
        }
    }
    public static int calculations(int i, int j, int k){
        int a = k/i;
        int b = k/j;
         int m= a + b;
         return m;
    }
}
