package global.goit.edu.module5.passangers;

public class RegularPassenger extends Passenger {

    @Override
    public String getType() {
        return "Regular";
    }

    @Override
    public int getTicketPrice() {
        return 199;
    }
}
