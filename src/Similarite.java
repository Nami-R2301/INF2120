import java.util.ArrayList;
import java.util.Collections;
import java.util.zip.CheckedOutputStream;

/**
 * Calcule la somme de déviation minimale en commençant par tranformer les tableaux d'arns pris en attirbuts
 * de la classe mère "CreationTabArn" en tableaux d'abbréviations. Ensuite, en utilisant l'attribut "DistanceMax",
 * la méthode de classe "correspondanceAbb" calcule la difference des correspondances entre les deux tableaux reçu
 * en paramètre par la méthode "tranformationEnAbb". Une fois terminer, le constructeur fait appel aux méthodes
 * "calculDistance pour trouver la somme de ceux-ci. Finalement, le constructeur appel les méthodes "calculM" et
 * "exponentielCalculM" pour trouver la similarité des deux ARN.
 *
 */

enum Codons {
    Ale ("AAA"),
    AAC, AAB,
    ;
    public String codons1;

    Codons(String codons1) {
        this.codons1 = codons1;
    }
}

public class Similarite extends CreationTabArn {

    public void tranformationEnAbb(ArrayList<String> tabArnA, ArrayList<String> tabArnB) {
        for (int i = 0; i < Math.max(tabArnA.size(), tabArnB.size()); ++i) {
            Codons tabA = Enum.valueOf(Codons<String>, "AAA");
            switch (tabArnA.get(i)) {
                case AAA:
                    tabArnA.set( i, "Ale");
            }
        }
    }

    public static int calculDistance(ArrayList<String> firstArray, ArrayList<String> secondArray,
                                     int distanceMaximale) {
        int sommeDistance = 0;

        for (int i = 0; i < firstArray.size(); i++) {
            ArrayList<Integer> longueurTempo = new ArrayList<>();
            for (int j = 0; j < secondArray.size(); j++) {
                if (firstArray.get(i).equals(secondArray.get(j))) {
                    longueurTempo.add(Math.abs(j - i));
                } else {
                    longueurTempo.add(distanceMaximale);
                }
                sommeDistance = Collections.min(longueurTempo);
            }
        }
        return sommeDistance;
    }

    public static int calculM(int sommeDistance, int n, int m, int d) {
        int sommeDenominateur = (n + m) * d;
        return (sommeDistance / sommeDenominateur);
    }


    public static double exponentielCalculM(double fonctionM) {
        return Math.exp(-6 * fonctionM * fonctionM);
    }


    public Similarite(String arnA, String arnB, int distanceMax) {
        super(arnA, arnB, distanceMax);
        tranformationEnAbb(tabArnA, tabArnB);
        deviationMinTotal = calculDistance(tabArnA, tabArnB, this.distanceMax);
        similarite = exponentielCalculM(calculM(deviationMinTotal, tabArnA.size(), tabArnB.size(),
                this.distanceMax));
    }
}
