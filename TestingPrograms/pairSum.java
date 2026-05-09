package TestingPrograms;

public class pairSum {

    static int[] pairsum2(int[] nums, int target) {

        int i = 0;
        int j = nums.length - 1;

        while (i < j) {

            int pairsum = nums[i] + nums[j];

            if (pairsum < target) {
                i++;
            }

            else if (pairsum > target) {
                j--;
            }

            else {
                return new int[]{i, j};
            }
        }

        return new int[]{-1, -1};
    }

    static int[] pairAdd1(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {

                    return new int[]{i, j};
                }
            }
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {

        int arr[] = {2, 7, 11, 13};

        int[] result = pairAdd1(arr, 19);

        for (int x : result) {
            System.out.print(x + " ");
        }

        System.out.println();

        result = pairsum2(arr, 9);

        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}