public class FirstNlastIndexOfOccurance {
    public  static  int first =-1;
    public  static  int last =-1;
    public static int total =0;

    public static  void index(int idx, String st, char element,int length){
        if(idx==length) {

            System.out.println(first);
            System.out.println(last);
            System.out.println("total element in string :"+total);
            return;
        }
            char current = st.charAt(idx);

        if(current==element)
        {
            if(first==-1){
                first=idx;
                total++;
            }
            else{
                last = idx;
                total++;
            }

        }
        index(idx+1,st,element,length);
    }
    public static void main(String[] args) {
        String stk = "Wht is your name pankaj kevat";
        int length = stk.length();

        index(0,stk,'a',length);
    }
}
