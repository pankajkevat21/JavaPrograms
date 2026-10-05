package TestingPrograms;
public class Solution {
    public static  int maxSubArray(int[] nums) {
        int Curr =0;
        int max =Integer.MIN_VALUE;
        for(int i =0;i<nums.length;i++){
            Curr += nums[i];
            max = Math.max(max,Curr);
            if(Curr<0){
                Curr =0;
            }
        }
        return max;
    }
    public static void main(String[] args) {

        int[] nums ={-2, -1, -3};

        System.out.println(maxSubArray(nums));
    }
}