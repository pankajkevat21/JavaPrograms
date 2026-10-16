class Main {
    public static int  sumOfSquares(int[] nums) {
        int n = nums.length;
        int sum =0;
        for(int i=0;i<=n-1;i++){
            if(n%(i+1) == 0){
                sum+= nums[i]* nums[i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr ={1,2,3,4};
        System.out.println(sumOfSquares(arr));
    }
}