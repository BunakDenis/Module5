package global.goit.edu.module5;

public class XFuelEngine extends Engine{

    private String fuel = "XFuel";
    protected String serialNumber;

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getFuelType() {
        return fuel;
    }

}