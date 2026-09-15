public class missingNumber {
    public int miss(int[] nums) {
        int N =nums.length;

        int missnum = N*(N+1)/2;
        int arsum =0;
        for(int sum : nums){
            arsum += sum;
        }

        return (missnum-arsum);
    }

    public static void main(String[] args) {
        int a[] ={1,2,3,5,6};
        missingNumber m1= new missingNumber();

        System.out.println(m1.miss(a));
    }
}
