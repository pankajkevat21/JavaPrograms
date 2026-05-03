public class Recrsn {
    static void movex(String str, int idx, int count, String newString)
    {
        if(idx==str.length()){
            for(int i=1;i<=count;i++){
                newString += 'x';
            }
            System.out.print("new String is->"+newString);
            return;
        }
        char current= str.charAt(idx) ;
        if(current=='x')
        {
            count++;
            movex(str,idx+1,count,newString);
        }
        else {
            newString = newString+ current;
            movex(str,idx+1,count,newString);

        }
    }
    public static void main(String[] args) {
        String Str = "axbcxxd";
        System.out.println("Old string ->"+Str);
        movex(Str,0,0,"");

    }
}
