import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumberExample8
{
    public static void main(String[] args)
    {
        System.out.println(generateRandomList(10,20,5));
    }
    private static List<Integer> generateRandomList(int belowthreshold, int uppperthreshold, int totalRandomNumber)
    {
        List<Integer> nRandom = new ArrayList<>(); // untuk nampung array
        int nR = 0; // di pakai untuk konversi tipe data random ke integer
        Random r = new Random();
        for (int i = 0; i < totalRandomNumber; i++) {
            nR = (int)(r.ints(belowthreshold, (uppperthreshold + 1)).limit(1).findFirst().getAsInt());
            nRandom.add(nR);
        }

        return nRandom;
    }
}
