
import java.util.*;

/**
 * Calcule la somme de déviation minimale en commençant par tranformer les tableaux d'arns pris en attirbuts

 * de la classe mère "CreationTabArn" en tableaux d'abbréviations. Ensuite, en utilisant l'attribut "DistanceMax",

 * la méthode de classe "correspondanceAbb" calcule la difference des correspondances entre les deux tableaux reçu

 * en paramètre par la méthode "tranformationEnAbb". Une fois terminer, le constructeur fait appel aux méthodes

 * "calculDistance pour trouver la somme de ceux-ci. Finalement, le constructeur appel les méthodes "calculM" et

 * "exponentielCalculM" pour trouver la similarité des deux ARN.

 */

public class Similarite extends CreationTabArn {

    public ArrayList<String> conversionEnum(ArrayList<String> tabArn){

        for ( int j = 0; j < tabArn.size(); j++ ) {
            if ( tabArn.get(j).equals(Codons.valueOf(tabArn.get(j)).toString())) {
                tabArn.set(j, (Codons.getabbCodons(Codons.valueOf(tabArn.get(j) ) ) ) );
            }
        }
        return tabArn;
    }

    public void tranformationEnAbb(ArrayList<String> tabArnA, ArrayList<String> tabArnB) {

        this.tabArnA = conversionEnum(tabArnA);

        this.tabArnB = conversionEnum(tabArnB);
    }

    public int calculDistance(ArrayList<String> firstArray, ArrayList<String> secondArray,
                              int distanceMaximale) {
        int distance = 0;
        int sommeDistance = 0;

        for (int i = 0; i < firstArray.size(); i++) {

            ArrayList<Integer> longueurTempo = new ArrayList<>();

            for (int j = 0; j < secondArray.size(); j++) {

                if (firstArray.get(i).equals(secondArray.get(j))) {
                    longueurTempo.add(Math.abs(j - i));
                } else {
                    longueurTempo.add(distanceMaximale);
                }
                distance = Collections.min(longueurTempo);
            }
            sommeDistance += distance;
        }
        return sommeDistance;

    }

    public double calculM(double distance1, double distance2, int n, int m, int d) {
        double sommeNumerateur = (distance1 + distance2);
        int sommeDenominateur = (n + m) * d;

        return (sommeNumerateur / sommeDenominateur);

    }

    public double exponentielCalculM(double fonctionM) {

        return Math.exp(-6 * fonctionM * fonctionM);

    }

    public Similarite(String arnA, String arnB, int distanceMax) {

        super(arnA, arnB, distanceMax);

        tranformationEnAbb(tabArnA, tabArnB);

        deviationMinTotalUn = calculDistance(tabArnA, tabArnB, this.distanceMax);

        deviationMinTotalDos = calculDistance(tabArnB, tabArnA, this.distanceMax);

        similarite = exponentielCalculM(calculM(deviationMinTotalUn, deviationMinTotalDos, tabArnA.size(),
                tabArnB.size(), this.distanceMax));

    }

}
