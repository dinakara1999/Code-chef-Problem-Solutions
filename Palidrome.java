import java.util.Scanner;

public class Palidrome {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Input");
        String pal = s.next();
        String copy = "";
        int ss = pal.length()-1;
        for (int i = ss ; i >= 0; i--){
            copy = copy + pal.charAt(i);
        }
        if(pal==copy)
        System.out.println("Palidrome");
        else System.out.println("Not Palidrome");
    }
}
