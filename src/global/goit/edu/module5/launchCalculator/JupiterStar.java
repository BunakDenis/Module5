package global.goit.edu.module5.launchCalculator;

public class JupiterStar extends Spaceport {


    @Override
    public int calculateTotalPrice(int passengerCount) {
        return 500 + (2 * passengerCount);
    }
}
