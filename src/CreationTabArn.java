import java.util.ArrayList;

public class CreationTabArn {

    protected ArrayList<String> tabArnA = new ArrayList<>();
    protected ArrayList<String> tabArnB = new ArrayList<>();
    protected int distanceMax;
    protected int deviationMinTotal;
    protected double similarite;

    private static boolean validationMajusculeArn( String arnA, String arnB) {
        return arnA.matches("^([ACGU])$") && arnB.matches("^([ACGU])$");
    }

    private static boolean validationContenuArn( String arnA, String arnB ) {
        return !arnA.isEmpty() && !arnB.isEmpty() && arnA.length() % 2 == 0 && arnB.length() % 2 == 0;
    }

    public CreationTabArn(String arnA, String arnB, int distanceMax) {
        validationContenuArn(arnA, arnB);
        validationMajusculeArn(arnA, arnB);
        if (validationContenuArn(arnA, arnB) && validationMajusculeArn(arnA, arnB)) {
            for (int i = 0; i < (Math.max(arnA.length(), arnB.length())); i += 3) {
                tabArnA.add(arnA.substring(i, i + 3));
                tabArnB.add(arnB.substring(i, i + 3));
            }
            this.distanceMax = Math.abs(distanceMax);
        }
    }

    @Override
    public String toString() {
        return
                ", max = " + distanceMax + "\n\n" +
                ", Similarite = " + similarite;
    }
}
