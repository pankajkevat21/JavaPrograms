class RecursionReverseString{
    static void printrec(String rev, int idx){
        if(idx<0){

            return;
        }
        System.out.print(rev.charAt(idx));
        printrec(rev,idx-1);
    }
    public static void main(String[] args) {
        String rev = "pankaj kevat";
        int idx = rev.length();
        printrec(rev,idx-1);
    }
}