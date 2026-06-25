package Array;

public class twoArrEqual {
    public static void main(String[] args) {
        int[] arr1 = {2,4,6,8};
        int[] arr2 = {2,4,6,8};
        if(arr1.length!=arr2.length){
            System.out.println("both arrays are not equal");
            return;
        } boolean isEqual = true;

        for (int i = 0; i < arr1.length; i++) {

            if (arr1[i] != arr2[i]) {

                isEqual = false;

                break;

            }

        }

        if (isEqual) {

            System.out.println("Both arrays are equal");

        } else {

            System.out.println("Both arrays are not equal");

        }
    }
}
