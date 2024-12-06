import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Algorithms {
    private static File f;
    private static Scanner s;
    public static void main(String[] args) throws FileNotFoundException {
        f = new File("Words.txt");
        int odds = odds();
        int evens = evens();
        int tenses = tenses();
        int big500 = big500();
        int greatest = greatest();
        int least = least();
        int sum = sum();
        double mean = mean();
        int mode = mode();
        System.out.println(odds);
        System.out.println(evens);
        System.out.println(tenses);
        System.out.println(big500);
        System.out.println(greatest);
        System.out.println(least);
        System.out.println(sum);
        System.out.println(mean);
        System.out.println(mode);
        s.close();
    }

    public static int odds() throws FileNotFoundException{
        s = new Scanner(f);
        int odds = 0;
        while (s.hasNext()) {
            if (s.nextInt() % 2 != 0)
                odds++;
        }
        return odds;
