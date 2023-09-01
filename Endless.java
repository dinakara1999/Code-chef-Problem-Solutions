import java.util.Scanner;

public class Endless {
    public static void Regardless(int x,int y,int m){
        int k=0;
        if (m == 0)
            if((float)x/y != (int)x/y)
                System.out.println((int) x/y+1);
            else System.out.println((int) x/y);
        else
        if((float)x/y != (int)x/y)
            System.out.println((int) (x+m)/y+1);
        else System.out.println((int) x/y+m);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-->0){
            int x = s.nextInt();
            int y = s.nextInt();
            int z = s.nextInt();
            int m = z/30;
            Regardless(x,y,m);
        }
    }
}
