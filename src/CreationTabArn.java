import java.util.ArrayList;

public class CreationTabArn {

    protected String arnA;
    protected String arnB;
    protected ArrayList<String> tabArnA = new ArrayList<>();
    protected ArrayList<String> tabArnB = new ArrayList<>();
    protected int distanceMax;

    private static boolean validationMajusculeArn( String arnA, String arnB) {
        return false;
    }

    private static boolean validationContenuArn( String arnA, String arnB ) {
        return !arnA.isEmpty() && !arnB.isEmpty();
    }

    public CreationTabArn(String arnA, String arnB, int distanceMax) {
        if (!arnA.isEmpty() && !arnB.isEmpty()) {
            for (int i = 0; i < arnA.length(); i +=3) {
                tabArnA.add(arnA.substring( i, i + 3));
            }
            for (int i = 0; i < arnB.length(); i+=3) {
                tabArnB.add(arnB.substring( i, i + 3));
            }
            if (distanceMax > 0) {
                this.distanceMax = distanceMax;
            }
        }
    }

    @Override
    public String toString() {
        return
                "DeviationA ='" + tabArnA + '\'' +
                ", DeviationB ='" + tabArnB + '\'' +
                ", max = " + distanceMax;
    }
}
