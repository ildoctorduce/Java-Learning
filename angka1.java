public class angka1 {
    private static void isPalindrome(int i) {
        int reverse = 0;
        int input = i;
        while (i > 0) {
            int remainder = i % 10;
            reverse = reverse * 10 + remainder;
            i = i / 10;
        }
        if (input == reverse) {
            System.out.println(""+ reverse);
        }
    }
//    private static void InputMet(int x,int y){
//        for (int i = x; i < y; i++);
//    }

//    public static void main(String[] args) {
//        for (int i = x; i < y; i++)
//            angka1.isPalindrome(i);
//    }

}



