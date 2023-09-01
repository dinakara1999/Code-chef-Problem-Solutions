public class RepeatedString {
    public static void main(String[] args) {
        String pattern = "Good Morning";
        DuplicateString(pattern);
    }
    static void DuplicateString(String pattern){
        char[] Array = pattern.toCharArray();
        int len = pattern.length();
        char[] newArray = new char[len];
        int k=0,flag;
        for (int i=0;i<len-1;i++){
            flag = 0;
            for (int p=0;p<k;p++){
                if (newArray[p]== Array[i]){
                    flag = 1;
                    break;
                }
            }
            if (flag == 0){
                for (int j = i+1;j<len;j++){
                    if (Array[i] == Array[j]) {
                        newArray[k++] = Array[i];
                        break;
                    }
                }
            }
        }
        System.out.println(newArray);
    }

}
