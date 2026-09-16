public class plusOne {
    public int[] plusOne(int[] digits) {
        // Walk from the last digit to the first
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;       // no carry needed, done
                return digits;
            }
            digits[i] = 0;         // it was 9 → becomes 0, carry continues
        }

        // If we get here, all digits were 9 → need one extra digit
        int[] result = new int[digits.length + 1];
        result[0] = 1;             // rest are already 0
        return result;
    }

    static void main(String[] args) {
        plusOne p1 = new plusOne();
      int digit[] ={9,9,9};
      int arr[] =p1.plusOne(digit);
      for (int a:arr){
          System.out.print(a+" ");
      }
    }
}
