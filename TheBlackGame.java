import java.util.Scanner;

public class TheBlackGame {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        boolean val=false;
        while (t-->0){
            int i=0;
            String input=s.next();
            int k=input.length();
            while (i<input.length()){
                if (input.charAt(i)==input.charAt(k--)) {
                    val = true;
                    i++;
                }
            }
        }
    }
}
