package global.goit.edu.module5.fir;

public class FirNumFizzBuzz extends FirNum {

    @Override
    public int calc(int n) {
        int result = 0;
        for(int i = 1; i <= n; i++) {
            if ((i % 3 == 0 || i % 5 == 0) && !(i % 15 == 0)) {
                result += i;
            }
        }
        return result;
    }
}
