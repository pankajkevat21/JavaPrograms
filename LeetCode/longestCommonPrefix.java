public class longestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        // Edge case: empty array
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Pehli string ko base maan lo
        String base = strs[0];
        String answer = "";

        // Base ke har character par loop chalao
        for (int i = 0; i < base.length(); i++) {
            char ch = base.charAt(i);

            // Baaki saari strings ko check karo
            for (int j = 1; j < strs.length; j++) {
                // Agar string chhoti hai ya character mismatch hai
                if (i >= strs[j].length() || strs[j].charAt(i) != ch) {
                    return answer;
                }
            }

            // Sab match kiya, to answer me add karo
            answer += ch;
        }

        return answer;
    }
public static void main(String[] args) {
    longestCommonPrefix ln = new longestCommonPrefix();
    String strs[] ={"dog","racecar"};
    String ans =ln.longestCommonPrefix(strs);
    System.out.println(ans);
}
}
