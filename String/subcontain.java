package String;

public class subcontain {
    public static void main(String[] args) {

        String str = "Hello i am pankaj kevat ";
        String subStr = "nkaj";
        boolean found = false;

        for (int i = 0; i <= str.length() - subStr.length(); i++) {
            int j;

            for (j = 0; j < subStr.length(); j++) {
                if (str.charAt(i + j) != subStr.charAt(j)) {
                    break;
                }
            }

            if (j == subStr.length()) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Substring found");
        } else {
            System.out.println("Substring not found");
        }
    }

}
