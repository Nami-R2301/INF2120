import java.util.ArrayList;

public class Resultat {

    protected String arnA;
    protected String arnB;
    protected ArrayList<Character> tabArnA = new ArrayList<>();
    protected ArrayList<Character> tabArnB = new ArrayList<>();
    protected int distanceMax;

    public Resultat(String arnA, String arnB, int distanceMax) {
        this.arnA = arnA;
        this.arnB = arnB;
        this.distanceMax = distanceMax;
    }

    public String getArnA() {
        return arnA;
    }

    public void setArnA(String codonsA) {
        this.arnA = codonsA;
    }

    public String getArnB() {
        return arnB;
    }

    public void setArnB(String codonsB) {
        this.arnB = codonsB;
    }

    public int getDistanceMax() {
        return distanceMax;
    }

    public void setDistanceMax(int distanceMax) {
        this.distanceMax = distanceMax;
    }

    @Override
    public String toString() {
        return
                "arnA = " + arnA + '\'' +
                ", arnB = " + arnB + '\'' +
                ", distanceMax =" + distanceMax;
    }
}
