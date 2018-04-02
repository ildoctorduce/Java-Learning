import java.util.Arrays;

public class BubbleSortExample
{
    public static void main (String args[])
    {
        int temp;
        int[] arr ={5, 12, 3, 19, 1, 47};

        System.out.println("Urutan angka sebelum di Sortirb :"+ Arrays.toString(arr));
        System.out.println();

        for (int a=1; a <= arr.length; a++)
        {
            System.out.println("Iterasi ke-"+(a));
            for (int b=0; b < arr.length-1; b++ )
            {
                if (arr[b] > arr[b+1])
                {
                    temp = arr[b];
                    arr[b] = arr[b + 1];
                    arr[b + 1] = temp;
                }
                System.out.println(Arrays.toString(arr));
            }
            System.out.println();
        }
        System.out.println("Hasil Akhir Setelah di Sortir :"+ Arrays.toString(arr));
/*        for (int a=0; a < arr.length;a++)
        {
            System.out.print(arr[a]);
        }*/
    }
}
