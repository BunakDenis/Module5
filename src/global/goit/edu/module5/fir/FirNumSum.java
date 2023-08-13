package global.goit.edu.module5.fir;

public class FirNumSum extends FirNum {
    @Override
    public int calc(int n) {
        int result = 0;
        if (n == 1) {
            return 1;
        }
        for (int i = 0; i <= n; i++) {
            result += i;
        }
        return result;
    }


}
