package Roadmap_class.array;
public class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        // Phase 1: Find the meeting point inside the cycle
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        // Phase 2: Find the entrance of the cycle = duplicate number
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }

    // Example usage
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1, 3, 4, 2, 2};
        System.out.println(sol.findDuplicate(nums)); // 2
    }
}