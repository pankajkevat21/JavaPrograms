package Array;

public class mergeArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {7,8,9,10,11,12};
        int j =0;
        int[] mergeArr = new int[arr1.length+ arr2.length];
        for (int i = 0; i < mergeArr.length; i++) {
            if(i< arr1.length) {

                mergeArr[i] = arr1[i];
            }
            if(i>=arr1.length){
                    mergeArr[i] = arr2[j++];
            }
        }

        System.out.println("merged array:");
        for (int i = 0; i < mergeArr.length; i++) {
            System.out.print(mergeArr[i]+" ");
        }
    }
}
/*
 package Array;

public class MergeArray {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {7, 8, 9, 10, 11, 12};

        int[] mergeArr = new int[arr1.length + arr2.length];

        int index = 0;

        // Copy arr1
        for (int i = 0; i < arr1.length; i++) {
            mergeArr[index++] = arr1[i];
        }

        // Copy arr2
        for (int i = 0; i < arr2.length; i++) {
            mergeArr[index++] = arr2[i];
        }

        System.out.println("Merged Array:");

        for (int i = 0; i < mergeArr.length; i++) {
            System.out.print(mergeArr[i] + " ");
        }
    }
}
 */