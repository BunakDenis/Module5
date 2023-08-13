package global.goit.edu.module5.fir;

public class FirNumFactorial extends FirNum {

    @Override
    public int calc(int n) {
        if (n == 0) {
            return 1;
        }

        if (n == 1) {
            return 1;
        }

        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }



    public static void main(String[] args) {
        FirNumFactorial a = new FirNumFactorial();
        System.out.println(a.calc(3));
        System.out.println(a.calc(5));
    }

}
