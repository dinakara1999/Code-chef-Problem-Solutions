public class Natural {
    int naturalNum(int n){
        if(n==1)
            return 1;
        else
            return n+naturalNum(n-1);
    }
    public static void main(String[] args) {
        Natural n=new Natural();
        int c=n.naturalNum(5);
        System.out.println(c);
    }
}
