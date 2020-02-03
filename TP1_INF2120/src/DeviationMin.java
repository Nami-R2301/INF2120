
public class DeviationMin extends Resultat {

    public DeviationMin(String arnA, String arnB, int distanceMax) {
        super(arnA, arnB, distanceMax);
        if (!arnA.isEmpty() && !arnB.isEmpty()) {
            for (char A : arnA.toCharArray()) {
                tabArnA.add(A);
            }
            for (char B : arnB.toCharArray()) {
                tabArnB.add(B);
            }
            this.distanceMax = distanceMax;
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
