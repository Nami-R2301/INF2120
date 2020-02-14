
import java.util.*;

/**
 * Calcule la somme de déviation minimale en commençant par tranformer les tableaux d'arns pris en attirbuts
 * de la classe mère "CreationTabArn" en tableaux d'abbréviations. Ensuite, en utilisant l'attribut "DistanceMax",
 * la méthode de classe "conversionEnum" calcule la difference des correspondances entre les valeurs enums et les
 * éléments du tableau en paramètre dans la méthode "TransformationEnAbb". Une fois terminer, le constructeur fait appel
 * à la méthode "calculDistance" deux fois pour trouver la somme des deux déviations minmales. Finalement, le
 * constructeur appel les méthodes "calculM" et "exponentielCalculM" pour trouver la similarité des deux ARN.

 */

public class Similarite extends CreationTabArn {
    /**
     * Verifie la correspondance des codons entre le tableau en attribut et les objets de la classe Codons.
     * Une fois une correspondance trouvée, elle converti celle-ci en son abréviation respective.
     * @param tabArn Le tableau passé en attribut contenant les codons.
     */
    public void transformationEnAbb(ArrayList<String> tabArn){

        for ( int j = 0; j < tabArn.size(); j++ ) {
            if ( tabArn.get(j).equals(Codons.valueOf(tabArn.get(j)).toString())) {
                tabArn.set(j, (Codons.getabbCodons(Codons.valueOf(tabArn.get(j) ) ) ) );
            }
        }
    }

    /**
     * Calcule la somme des distances minimales entre les deux tableaux d'abréviation(tabArnA et tabArnB).
     * @param firstArray Tableau d'abréviation arnA ou arnB.
     * @param secondArray Le deuxième tableau d'abréviation restant.
     * @param distanceMaximale Distance maximale saisi par l'usager.
     * @return La somme des distances minimales pour le tableau entré comme premier paramètre.
     */
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

    /**
     * Calcule un ratio nécessaire pour l'algorithme de la métrique.
     * @param distance1 Le résultat de la méthode calculDistance pour le premier ArrayList.
     * @param distance2 Le résultat de la méthode calculDistance pour le deuxième ArrayList.
     * @param n La taille du premier tableau des abréviations.
     * @param m La taille du deuxième tableau des abréviations.
     * @param d La distance maximale saisi par l'usager.
     * @return Le ratio.
     */
    public double calculM(double distance1, double distance2, int n, int m, int d) {
        double sommeNumerateur = (distance1 + distance2);
        int sommeDenominateur = (n + m) * d;

        return (sommeNumerateur / sommeDenominateur);

    }

    /**
     * Calcule la valeur exponentielle de la multiplication entre fonctionM au carré et -6.
     * @param fonctionM Le résultat de la méthode calculM.
     * @return Le chiffre representant la similarité entre les deux ARN.
     */
    public double exponentielCalculM(double fonctionM) {
        return Math.exp(-6 * fonctionM * fonctionM);

    }

    /**
     * Constructeur qui appelle la classe mère pour recevoir les ArrayList.
     * Les quatre méthodes nécéssaires qui calculent la similarité entre les deux ARN sont ensuite appelées.
     * Celles-ci sont exponentielCalculM, calculM, calculDistance et transformationEnAbb.
     * @param arnA La première chaîne de Codons saisi par l'usager.
     * @param arnB La deuxième chaîne de Codons saisi par l'usager.
     * @param distanceMax La distance maximale saisi par l'usager.
     */
    public Similarite(String arnA, String arnB, int distanceMax) {

        super(arnA, arnB, distanceMax);

        transformationEnAbb(tabArnA);
        transformationEnAbb(tabArnB);

        deviationMinTotalUn = calculDistance(tabArnA, tabArnB, this.distanceMax);

        deviationMinTotalDos = calculDistance(tabArnB, tabArnA, this.distanceMax);

        similarite = exponentielCalculM(calculM(deviationMinTotalUn, deviationMinTotalDos, tabArnA.size(),
                tabArnB.size(), this.distanceMax));

    }

}
