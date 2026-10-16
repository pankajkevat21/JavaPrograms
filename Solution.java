class Solution {
    public static  int[] sortArrayByParityII(int[] nums) {
        int i =0;
        int j =1;
        int size = nums.length;
        while(i<=size-2){
             if(nums[i]%2==0){
                i+=2;
             }
             if(nums[j]%2 !=0){
                j+=2;
             }
             else {
                while(i<size-2){
                    if(nums[i]%2 != 0){
                        int temp =nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                    }
                }
             }
        }
        return nums;
    }
    void main(){
        int arr[] = {2,4,5,7};
       int arr2[] = sortArrayByParityII(arr);
       for(int l :arr2){
           System.out.println(l);
       }
    }
}