/**
 * Created by rafael on 10/06/16.
 */
public class Main {
    int x;
    int y;

    public static void main(String[] args) {
        System.out.println(multipli(2, 2));
    }


    public static int vetorsomatorio(int [] a, int x, int y) {
f

    }

    public static int multipli(int a, int b) {
        if (b == 0)
            return 0;
        else
            return a + multipli(a, b - 1);
    }
}
