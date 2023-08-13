package global.goit.edu.module5.engine;

import global.goit.edu.module5.engine.XFuelEngine;

public class AdvancedXFuelEngine extends XFuelEngine {
/*    private int power;
    private String serialNumber;

    @Override
    public int getPower() {
        return power;
    }

    @Override
    public void setPower(int power) {
        this.power = power;
    }

    public String getSerialNumber() {
        return serialNumber;
    }
    @Override
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }*/

    public void printInfo() {
        System.out.println("Serial number is " + serialNumber + ", power is " + getPower());
    }

}
