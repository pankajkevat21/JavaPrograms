public class Q3ReverseNumber {
    public static void main(String[] args) {
        int num = 123;
        int reverse = 0;
        System.out.println(num);

        while(num!=0)
        {
            int reminder = num%10;
            reverse = reverse *10 + reminder;
            num = num/10;
        }
        System.out.println(reverse
        );

    }

}
