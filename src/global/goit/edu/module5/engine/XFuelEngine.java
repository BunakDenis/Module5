package global.goit.edu.module5.engine;

import global.goit.edu.module5.engine.Engine;

public class XFuelEngine extends Engine {

//    private String fuel = "XFuel";
    protected String serialNumber;

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getFuelType() {
        return "XFuel";
    }

}