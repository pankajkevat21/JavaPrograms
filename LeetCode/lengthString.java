public class lengthString {
    public int lengthOfLastWord(String s) {
        int size = s.length();
        int count = 0;
        for (int i = size-1; i >=0 ; i--) {
            if(s.charAt(i)==' ' &&count==0){
                continue;
            }
            else{
                if(s.charAt(i)!=' '){
                    count++;
                }
                else{
                    break;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        lengthString ln = new lengthString();
       int k = ln.lengthOfLastWord("a");
        System.out.println(k);
    }
}
