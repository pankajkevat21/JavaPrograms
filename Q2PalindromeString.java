public class Q2PalindromeString {
    static void palindromeCheck(String str) {
        int size = str.length() ;
        for (int i = 0; i < size/2; i++) {
            {
                if (str.charAt(i) != str.charAt(size - 1 - i)) {
                    System.out.println("String is not palindrome");
                    return;
                }
            }
        }
            System.out.println("String is palindrome");
    }
    public static void main(String[] args) {
        String name ="pankajaknap";
       //palindromeCheck(name);
        String newStr="";
     for(int i= name.length()-1;i>=0;i--){
         newStr += name.charAt(i);
     }
        System.out.println(newStr+" "+name);
     if(name.equals(newStr))
     {
         System.out.println("String is palindrome");
     }
     else {
         System.out.println("String is not  palindrome");
     }
    }
}
