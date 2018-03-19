public class angka2 {
    private static void isPalindrome(int i) {
        int reverse = 0;
        int input1 = i;
        while (i > 0) {
            int remainder = i % 10;
//            System.out.println(remainder);
            reverse = reverse * 10 + remainder;
//            System.out.println(reverse);
            i = i / 10;
        }
        if (input1 == reverse) {
            System.out.println(+ reverse);
        }
    }
    public static void main(String[] args) {

        for (int i = 10; i < 100; i++) {
            isPalindrome(i);
        }
    }
}
