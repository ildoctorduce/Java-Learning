public class bintang1 {
    public static void main(String[] args) {
        for (int i=1;i<=10;i++) {
            for (int y = 1; y <= 10 - i; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
