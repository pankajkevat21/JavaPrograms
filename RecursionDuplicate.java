public class RecursionDuplicate {
    static boolean map[]= new boolean[26];
    static void RemoveDuplicateElement(String str, int idx, String newStr){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar-'a']){
            RemoveDuplicateElement(str,idx+1,newStr);
        }
        else {
            newStr+= currChar;
            map[currChar-'a']= true;
            RemoveDuplicateElement(str,idx+1,newStr);
        }
    }
    public static void main(String[] args) {
        String str = "abbdcdaldlhgathaen";
        RemoveDuplicateElement(str,0,"");

    }
}
