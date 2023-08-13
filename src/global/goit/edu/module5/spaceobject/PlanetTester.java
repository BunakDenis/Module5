package global.goit.edu.module5.spaceobject;

public class PlanetTester {

    public String test(SpaceObject object) {

        if (object instanceof Planet) {
            return "planet";
        } else {
            return "not planet";
        }

    }
}