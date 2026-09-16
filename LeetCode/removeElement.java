public class removeElement {
    public int remove(int[] nums, int val) {
        int slow = 0;
        for (int i = 0; i < nums.length; i++) {

            if(nums[i] != val){
                nums[slow++] = nums[i];
            }
        }
        return slow;
    }

   public static void main(String[] args) {
removeElement rm = new removeElement();
int arr[] ={0,1,2,2,3,0,4,2};

int ans =rm.remove(arr,2);
       System.out.println(ans);
    }
}
