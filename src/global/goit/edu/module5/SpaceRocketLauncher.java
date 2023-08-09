package global.goit.edu.module5;

public class SpaceRocketLauncher {

    private int bigRocketCount;
    private int smallRocketCount;

    public int getBigRocketCount() {
        return bigRocketCount;
    }

    public void setBigRocketCount(int bigRocketCount) {
        if (bigRocketCount <= 100 & bigRocketCount > 0) {
            this.bigRocketCount = bigRocketCount;
        } else {
            return;
        }
    }

    public int getSmallRocketCount() {
        return smallRocketCount;
    }

    public void setSmallRocketCount(int smallRocketCount) {
        if (smallRocketCount <= 100 & smallRocketCount > 0) {
            this.smallRocketCount = smallRocketCount;
        } else {
            return;
        }
    }

    public void launchBigRocket() {
        if (bigRocketCount > 0) {
            bigRocketCount--;
            System.out.println("Launch big rocket");
        }
    }

    public void launchSmallRocket() {
        if (smallRocketCount > 0) {
            smallRocketCount--;
            System.out.println("Launch small rocket");
        }
    }

    public int getTotalPower() {
        return (bigRocketCount * 100) + (smallRocketCount * 50);
    }

}