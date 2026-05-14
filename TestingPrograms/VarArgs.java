package  TestingPrograms;
public class VarArgs {
    static int sum(String name ,int ... arr)
    {
        int result = 0;
        System.out.println("my name is :"+name);
        for(int a:arr)
        {
            result+=a;
        }
        return  result;
    }

    static void main(String[] args) {
        System.out.println("the sum of all values:"+ sum("Pankaj",5,6));
        System.out.println("the sum of all values:"+ sum("Rohit",5,7,1,2,6));
        System.out.println("the sum of all values:"+ sum("Aman",5,6,9,8));
        System.out.println("the sum of all values:"+ sum("Rahul", 5,6,8));
    }
}
