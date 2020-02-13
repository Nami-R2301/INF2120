import java.util.ArrayList;

/**
 * Ceci est la classe mère de la classe 'Similarite' qui sert à fournir les attibuts d'instances nécéssaires pour celle-
 * ci (utilisé dans ses méthodes). Entre autre, elle est le 'bodyguard' qui protège la classe fille des entrées érronées
 * possible lorsque les méthodes de la classe fille font appellent au constructeur de cette classe. Par la suite, après
 * la validation des entrées, elle sert a convertir les ARNs en triplets de String qui seront ensuite mis dans des
 * ArrayList de type String. Grâce à l'héritage, la classe 'Similarite' va pouvoir utiliser ceux-ci pour ses calculs.
 */

public class CreationTabArn {

    protected ArrayList<String> tabArnA = new ArrayList<>();    //Tableau de triplet de codons #1
    protected ArrayList<String> tabArnB = new ArrayList<>();    //Tableau de triplet de codons #2
    protected int distanceMax;
    protected double deviationMinTotalUn;                       //Première somme des déviations minimales
    protected double deviationMinTotalDos;                      //Deuxième somme des déviations minimales
    protected double similarite;


    /**
     * Cette méthode constitut à valider le contenu des chaines de codons saisi par l'utilisateur pour quelle soient
     * belle et bien constitué avec seulement les caractères A,C,G,U.
     * @param arnA La chaine de caractère saisie par l'utilisateur.
     * @return Un boolean qui détermine si la chaine est valide (True/False).
     */
    public static boolean validationContenuArn( String arnA) {
        return arnA.matches("^([ACGU]+)$");
    }

    /**
     *
     * @param arnA
     * @return
     */
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
        return "\nSimilarite = " + similarite;
    }

}