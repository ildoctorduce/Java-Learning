public class Bintang7 {
    public static void generateBintang(int sizeA,int sizeB) {
            for (int i=1;i<=sizeA; i++) {
                for (int y=sizeB;y>0; y--) {
                    System.out.print("*");
                }
                System.out.println();
            }

//            for (int i = 1; i <= sizeB; i++) {
//                for (int y = 1; y <= sizeB; y++) {
//                    System.out.print("*");
//                }
//                System.out.println();
//            }

    }
}