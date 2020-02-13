import java.util.ArrayList;



public class CreationTabArn {

    protected ArrayList<String> tabArnA = new ArrayList<>();

    protected ArrayList<String> tabArnB = new ArrayList<>();

    protected int distanceMax;

    protected double deviationMinTotalUn;

    protected double deviationMinTotalDos;

    protected double similarite;

    public static boolean validationMajusculeArn( String arnA) {

        return arnA.matches("^([ACGU]+)$");
    }

    public static boolean validationMultipleTroisArn( String arnA) {

        return arnA.length() % 3 == 0 ;
    }

    public CreationTabArn(String arnA, String arnB, int distanceMax) {

        for (int i = 0; i < arnA.length(); i += 3) {
            tabArnA.add(arnA.substring(i, i + 3));
        }
        for (int i = 0; i < arnB.length(); i+=3 ) {
            tabArnB.add(arnB.substring(i, i + 3));
        }
        this.distanceMax = distanceMax;
    }

    @Override

    public String toString() {

        return
                "\nSimilarite = " + similarite;

    }

}