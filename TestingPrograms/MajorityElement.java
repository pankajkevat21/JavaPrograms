package TestingPrograms;
import java.util.Arrays;
public class MajorityElement {
    static int moores(int[] nums)
    {
        int freq =0;
        int ans = 0;
        for (int i = 0; i <nums.length ; i++) {
            if(freq==0){
                ans = nums[i];
            }
            if(ans==nums[i]){
                freq++;
            }
            else
                freq--;

        }
   return ans;
    }
    static int majority(int[] nums)
    {
        for(int val: nums){
            int freq =0;
            for (int el : nums){
                if(el==val){
                    freq++;
                }
            }
            if(freq>nums.length/2){
                return val;
            }
        }
return  -1;

    }

    static int majority1(int[] nums)
    {
        Arrays.sort(nums);
        int freq = 1;
        int ans = nums[0];
        for (int i = 1; i <nums.length ; i++) {
            if(nums[i]==nums[i-1])
                freq++;
            else{
                freq =1;
                ans = nums[i];
            }
            if(freq> nums.length/2)
                return ans;
        }
return ans;
    }
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,2,2,2};
        //brute force approch O(n*n)
        System.out.println(majority(arr));

        //optimal solution O(n log n)
        System.out.println(majority(arr));
     //moore's algorithm
        System.out.println(majority(arr));


    }
}
