public class kata1 {
    public static void bPalindrome(String x) {
        int length  = x.length();
        int i, begin, end, middle;
        begin  = 0;
        end    = length - 1;
        middle = (begin + end)/2;

        for (i = begin; i <= middle; i++) {
            if (x.charAt(begin) == x.charAt(end)) {
                begin++;
                end--;
            }
            else {
                break;
            }
        }
        if (i == middle + 1) {
            System.out.println(x);
        }
    }
    public static void main(String[] args){
        kata1.bPalindrome("kataki");
    }
}
