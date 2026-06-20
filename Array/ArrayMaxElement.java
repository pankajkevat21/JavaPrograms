package Array;

class ArrayMaxElement {
    public static void main(String[] args) {
        int[] arr ={600,3,7,8,90};
        int max =arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max = arr[i];
            }
            if(min>arr[i]){
                min = arr[i];
            }

        }
        System.out.println("min value of array :"+min);
        System.out.println("max element of this array"+max);
    }
}
