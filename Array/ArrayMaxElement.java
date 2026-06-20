package Array;

class ArrayMaxElement {
    public static void main(String[] args) {
        int[] arr ={600,3,7,8,90};
        int max =arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max = arr[i];
            }

        }
        System.out.println(max);
    }
}
