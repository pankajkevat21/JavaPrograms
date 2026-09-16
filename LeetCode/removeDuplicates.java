public class removeDuplicates {
    public int removeDuplicates(int[] nums) {

        int slow =0;
        int fast =1;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[slow]==nums[fast]){
                fast++;
            }
            else{
                slow++;
                nums[slow]= nums[fast];
                fast++;
            }
        }
        return slow+1;
    }
    static void main(String[] args) {

    }
}
