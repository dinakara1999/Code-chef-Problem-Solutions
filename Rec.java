import java.util.Scanner;
public class Rec {
    int sum(int x){
        int s=1;
        if(x==1){
           return x;
        }
        else {
            for (int i=x;i>0;i--){
                s*=i;
            }
            return s;
        }
    }
    public static void main(String[] args) {
       Rec r=new Rec();
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int fact=r.sum(x);
        System.out.println(fact);
    }
}
