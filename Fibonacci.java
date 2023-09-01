public class Fibonacci {
    static int[] fibnacsi(int n){
        int x[]=new int[n];
        x[0]=0;
        x[1]=1;
        for (int i=2;i<n;i++){
            x[i]=x[i-1]+x[i-2];
        }
        return x;
    }
    public static void main(String[] args) {
        int[] result=fibnacsi(5);
        System.out.println(result);
    }
}
