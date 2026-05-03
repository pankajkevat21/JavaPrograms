public class Q27SmallLarge2dArray {
    public static void main(String[] args) {
        int[][] arr = {
                {11, 2, 3},
                {4, 75, 6},
                {7, 8, 79}
        };
        int small = arr[0][0];
        int large = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(small>arr[i][j])
                {
                    small = arr[i][j];
                }
                if(large<arr[i][j])
                {
                    large = arr[i][j];
                }
            }


        }
        System.out.println("smallest element:"+small+"\nLargest element:"+large);

    }
}
