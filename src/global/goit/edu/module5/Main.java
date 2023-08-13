package global.goit.edu.module5;

import global.goit.edu.module5.constant.Planets;
import global.goit.edu.module5.copyright.Copyright;
import global.goit.edu.module5.passangers.Passenger;
import global.goit.edu.module5.passangers.RegularPassenger;
import global.goit.edu.module5.passangers.VIPPassenger;
import global.goit.edu.module5.point.Point;
import global.goit.edu.module5.spaceshipCalc.SpaceshipCalc;
import global.goit.edu.module5.stars.Stars;
import global.goit.edu.module5.tanker.MX200Tanker;
import global.goit.edu.module5.tanker.Tanker;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Stars stars = new Stars();
        stars.setCount(153);
        System.out.println(stars);
        System.out.println(stars.getCount());

    }
}