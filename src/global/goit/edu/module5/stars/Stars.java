package global.goit.edu.module5.stars;


public class Stars {

    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        String result = "";
        int starName = count;
            while (starName >= 1000) {
                starName -= 1000;
                result += 'X';
            }
            while (starName >= 100) {
                starName -= 100;
                result += 'Y';
            }
            while (starName >= 10) {
                starName -= 10;
                result += 'Z';
            }
            while (starName >= 1) {
                starName -= 1;
                result += '*';
            }
            return result;
    }
}