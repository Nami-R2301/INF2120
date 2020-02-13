import java.util.InputMismatchException;
import java.util.Scanner;

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

        try {

            System.out.println(ARN_UN);
            Scanner arn1 = new Scanner(System.in);
            String arnA = arn1.next().trim();
            if (!CreationTabArn.validationMultipleTroisArn(arnA) || !CreationTabArn.validationMajusculeArn(arnA)) {
                System.err.println(MSG_ERREUR);
                System.exit(-1);
            }

            System.out.println(ARN_DEUX);
            Scanner arn2 = new Scanner(System.in);
            String arnB = arn2.next().trim();
            if (!CreationTabArn.validationMultipleTroisArn(arnB) || !CreationTabArn.validationMajusculeArn(arnB)) {
                System.err.println(MSG_ERREUR);
                System.exit(-2);
            }

            System.out.println(DISTANCEMAX);
            Scanner d = new Scanner(System.in);
            int distanceMax = d.nextInt();
            d.close();
            if (distanceMax <= 0) {
                System.err.println(MSG_ERREUR);
                System.exit(-3);
            }

            CreationTabArn s1 = new Similarite(arnA, arnB, distanceMax);
            System.out.println(s1);


        }catch (ArrayIndexOutOfBoundsException e1) {

            System.err.println("Une méthode dans la classe 'CréationTabArn' a échoué à cause d'un index" +

                    " hors bornes !");

        }catch (NullPointerException e2) {

            System.err.println("Une méthode dans la classe 'CréationTabArn' a échoué à cause d'un appel" +

                    " d'une valeur nulle !");

        }catch (NumberFormatException e3) {

            System.err.println("Une méthode de la classe 'Similarité' a échoué à cause d'un appel" +

                    " de mauvais type (Ex: String lors d'un appel double ou int et vise-versa) !");

        }catch (InputMismatchException e5) {
            System.err.println("\nErreur! La distance saisie n'est pas un entier positif!");
        }
    }
}