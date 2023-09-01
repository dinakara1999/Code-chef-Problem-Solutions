import java.util.Scanner;

public class DigitPalidrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Input");
        int n = s.nextInt();
        int i,sum = 0,r;
        i=n;
        while (n>0){
            r = n%10;
            sum =(sum*10) + r ;
            n = n/10;
        }
        if (i == sum)
            System.out.println("Palidrome");
        else System.out.println("not Palidrome");
    }
}
