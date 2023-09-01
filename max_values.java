import java.util.Scanner;
public class max_values {
    static void max_value(int a[]){
        int nax= a[0];
        int min= a[0];
        for (int i=1;i<a.length;i++)
        {
            if (nax<a[i])
                nax=a[i];
            if (min > a[i])
                min=a[i];
        }
        System.out.println("Max values : "+nax);
        System.out.println("Max values : "+min);
    }

    public static void main(String[] args) {
        //max_values max=new max_values();
        Scanner s=new Scanner(System.in);
        System.out.print("Enter array size :");
        int n=s.nextInt();
        int a[]=new int[n];

        for (int i=0;i<a.length;i++){
            a[i]=s.nextInt();
        }
        max_value(a);
    }
}
