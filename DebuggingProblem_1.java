import java.util.Scanner;

public class DebuggingProblem_1 {
     static int PercentageCalculting(int a,int b){
        return (int)b/a;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            int k=sc.nextInt();
            int j=sc.nextInt();
            int results=PercentageCalculting(k,j);
            System.out.println(results);
        }
    }
}
