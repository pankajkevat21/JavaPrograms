package String;

public class strPalindrome {
    public static void main(String[] args) {
        String str = "madam";
        int j = str.length()-1;
        int i =0;
        boolean check = true;
        while (i<j){
            if (str.charAt(i)!= str.charAt(j)){
                check = false;
                break;
            }
            i++;
            j--;
        }
            if (check){
                System.out.println("String is palindrome");
            }
            else {
                System.out.println("String is not palindrome");
            }
        }

    }

