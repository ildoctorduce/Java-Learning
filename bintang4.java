public class bintang4 {
    public static void main(String[] args) {
 //       int a,b<=10;
        for (int i=1;i<=10;i++) {
            for (int y = 1; y <= 10 - i; y++)
                System.out.print("*");
            if (i!=10) {
                System.out.println();
            }
        }
//        System.out.print("*");
        for (int i = 2; i <= 10; i++) {
            for (int y = 1; y <= i; y++)
                System.out.print("*");
            System.out.println();

        }
    }
}