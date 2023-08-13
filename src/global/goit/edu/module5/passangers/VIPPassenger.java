package global.goit.edu.module5.passangers;

public class VIPPassenger extends Passenger {

    @Override
    public String getType() {
        return "VIP";
    }

    @Override
    public int getTicketPrice() {
        return 399;
    }
}
