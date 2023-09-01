import java.util.Scanner;

public class Wordle {
    public static void replaceWord(String a,String b){
        int i;
        int j=(int) ((a.length()+b.length())/2);
        char result[]= new char[j];
        for (i=0;i<a.length();i++){
            if (a.charAt(i)==b.charAt(i))
            {
                result[i]=+'G';
            }
            else
                result[i]=+'B';
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0){
            String a=s.next();
            String b=s.next();
            replaceWord(a,b);

        }

    }
}
