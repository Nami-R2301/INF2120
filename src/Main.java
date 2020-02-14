import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Cette classe sert à démarrer le programme en faisant des vérifications sur les entrées de l'utilisateur
 * pour valider ceux-ci avant la construction de la classe mère (CreationTabArn).
 * @author Nami Reghbati REGN03079808
 * @author Rafael Hernandez Garcia HERR14018808
 * Date complété: 2020/02/13
 */

public class Main {

    public static String ARN_UN = "\nVeuillez entrez une votre première chaine d'ARN ci-dessous, " +
            "suivi de la touche 'ENTER'... ";

    public static String ARN_DEUX = "\nVeuillez entrez une votre deuxième chaine d'ARN ci-dessous, " +
            "suivi de la touche 'ENTER'... ";

    public static String DISTANCEMAX = "\nVeuillez entrez une la distance maximale désiré.\n" +
            "(Attention, elle doit être un entier positif!)";

    public static String MSG_ERREUR = "La chaine de caractères est invalide!\nVeuillez vous assurez que " +
            "sa longueur soit un multiple de 3\net qu'elle ne contienne que des majuscules" +
            " comprises entre 'A-C-G-U'!";

    public static void main(String[] args) {

        try {                           //Solution envers les exceptions possibles.

            System.out.println(ARN_UN);
            Scanner arn1 = new Scanner(System.in);  //ARN #1
            String arnA = arn1.next().trim();
            if (CreationTabArn.validationMultipleTroisArn(arnA) || CreationTabArn.validationContenuArn(arnA)) {
                System.err.println(MSG_ERREUR);
                System.exit(-1);
            }

            System.out.println(ARN_DEUX);
            Scanner arn2 = new Scanner(System.in);  //ARN #2
            String arnB = arn2.next().trim();
            if (CreationTabArn.validationMultipleTroisArn(arnB) || CreationTabArn.validationContenuArn(arnB)) {
                System.err.println(MSG_ERREUR);
                System.exit(-2);
            }

            System.out.println(DISTANCEMAX);
            Scanner d = new Scanner(System.in);     //Distance maximale
            int distanceMax = d.nextInt();
            d.close();                          //Fermeture du canal de lecture
            if (distanceMax <= 0) {
                System.err.println(MSG_ERREUR);
                System.exit(-3);
            }

            CreationTabArn s1 = new Similarite(arnA, arnB, distanceMax);    //Contructeur principale qui déroule tout

            System.out.println(s1);     //Affichage du résultat

        }catch (InputMismatchException e5) {    //Si Scanner lance une exception lors de la saisi de l'utilisateur.

            System.err.println("\nErreur! La distance saisie n'est pas un entier positif!");
        }
    }
}