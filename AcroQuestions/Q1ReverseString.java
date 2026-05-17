public class Q1ReverseString {
    static void ReverseString(String str, int idx)
    {
        if(idx==0){
            System.out.print(str.charAt(idx));

            return;
        }
        System.out.print(str.charAt(idx));
        ReverseString(str, idx-1);
    }
    public static void main(String[] args) {
        String str = "pankaj kevat";
       /*
        int size = str.length();
        for (int i = size-1; i >=0 ; i--) {
            System.out.print(str.charAt(i));
    }
       */
        ReverseString(str,str.length()-1);


    }
}
