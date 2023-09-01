//Add two string value and get the sum of two values
import java.math.BigInteger;
import java.util.Scanner;

public class Leetcode05 {
    void Mull(String i, String j){
        BigInteger k= BigInteger.valueOf(Long.parseLong(i));
        BigInteger l= BigInteger.valueOf(Long.parseLong(j));
        BigInteger m=k.multiply(l);
        System.out.println(m);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Leetcode05 l05=new Leetcode05();
        System.out.print("Enter Input 1:");
        String i=sc.next();
        System.out.print("Enter Input 2:");
        String j=sc.next();
        l05.Mull(i,j);
    }
}