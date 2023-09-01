import java.util.Scanner;

public class searchInsetPosition {

    public int searchElement(int[] nums, int target){
        return target;
    }
    public static void main(String[] args) {
        searchInsetPosition so=new searchInsetPosition();
        System.out.println("Enter the inputs");
        Scanner sc=new Scanner(System.in);
        int [] nums = new int[10];
        for (int i=0;i<nums.length;i++){
            nums[i]= sc.nextInt();
        }
        int traget=sc.nextInt();
        int result=so.searchElement(nums,traget);
        System.out.println(result);
    }
}
