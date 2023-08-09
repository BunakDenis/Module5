package global.goit.edu.module5;

public class SpaceShip {
    private String name;
    private String serialNumber;

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        if (serialNumber.substring(0,2).equals("SN") & serialNumber.length() == 8) {
            this.serialNumber = serialNumber;

        } else {
            return;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isBlank() | name.length() > 100) {
            return;
        }
        this.name = name;
    }

    public void printInfo(){
        System.out.println("Name is " + name + ", serial number is " + serialNumber);
    }

    //Test output
    public static void main(String[] args) {
        SpaceShip ship = new SpaceShip();

        ship.setSerialNumber("SN506788");
        System.out.println(ship.getSerialNumber()); //Should be SN506788

        ship.setSerialNumber("EE123456");
        System.out.println(ship.getSerialNumber()); //Should be SN506788 - old value
    }
}