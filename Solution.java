import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==nums[i+1])
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
   int arr[]= {1,4,6,3,5,1};
        Arrays.sort(arr);
        for (int x:arr){
            System.out.println(x);
        }
        System.out.println(Arrays.toString(arr));
   Solution sc = new Solution();
   boolean bl =sc.containsDuplicate(arr);
        System.out.println(bl);
    }
}