import java.util.Scanner;

public class Repeat {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-->0){
            int i =s.nextInt();
            int j = s.nextInt();
            int k = j * 3;
            System.out.println(i/k);
        }
    }
}
