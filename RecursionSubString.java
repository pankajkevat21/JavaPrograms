public class RecursionSubString {
    static void subStr(String str, int idx, String newStr){
        if(idx==str.length())
        {
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);

        subStr(str,idx+1,newStr+currChar);
        subStr(str,idx+1,newStr);
    }
    public static void main(String[] args) {
     String str = "ab";
     subStr(str, 0, "");
    }
}
