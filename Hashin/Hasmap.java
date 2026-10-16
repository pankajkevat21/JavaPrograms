package Hashin;
import java.util.HashMap;
import java.util.*;

class Hasmap {
    public static  int[] relativeSortArray(int[] arr1, int[] arr2) {
        // Step 1: count frequency of each element in arr1
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : arr1) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int[] ans = new int[arr1.length];
        int idx = 0;

        // Step 2: add elements in the order of arr2
        for (int num : arr2) {
            if (freq.containsKey(num)) {
                int count = freq.get(num);
                for (int i = 0; i < count; i++) {
                    ans[idx++] = num;
                }
                freq.remove(num);
            }
        }

        // Step 3: add remaining elements in ascending order
        List<Integer> remaining = new ArrayList<>(freq.keySet());
        Collections.sort(remaining);

        for (int num : remaining) {
            int count = freq.get(num);
            for (int i = 0; i < count; i++) {
                ans[idx++] = num;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5,6,1,2,3,4,5};
        int arr2[] ={2,1,3,4};
        int arr3[] = relativeSortArray(arr1,arr2);
        for(int num:arr3){
            System.out.print(num+" ");
        }
    }
}