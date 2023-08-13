package global.goit.edu.module5.fir;

public class FirNumBasis extends FirNum {

    @Override
    public int calc(int n) {

        if (n == 0) {
            return 0;
        }
        int result = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                result += i;
            }
        }
        return result / 2;
    }
}
