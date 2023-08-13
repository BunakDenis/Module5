package global.goit.edu.module5.fir;

public class FirNumMultiplyOdd extends FirNum {

    @Override
    public int calc(int n) {
        int result = 1;
        if (n == 0) {
            return 1;
        }

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                result *= i;
                System.out.println(i % 2);
            }
        }
        return result;
    }
}