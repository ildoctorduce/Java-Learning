public class bintang5 {
    public static void generateBintang(int size){
        for (int i=1;i<=size;i++) {
            for (int y = 1; y <= size - i; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
