public class VarArgs {
    static int sum(int ...arr)
    {
        int result = 0;
        for(int a:arr)
        {
            result+=a;
        }
        return  result;
    }

    static void main(String[] args) {
        System.out.println("the sum of all values:"+ sum(5,6));
        System.out.println("the sum of all values:"+ sum(5,7,1,2,6));
        System.out.println("the sum of all values:"+ sum(5,6,9,8));
        System.out.println("the sum of all values:"+ sum(5,6,8));
    }
}
