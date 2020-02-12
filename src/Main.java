
public class Main {
    public static void main(String[] args) {
        try {
            CreationTabArn s1 = new Similarite("AAAUUU", "ACAGCA", 0);
            System.out.println(s1);
        }catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println("Une méthode dans la classe 'CréationTabArn' a échoué à cause d'un index" +
                    " hors bornes !");
        }catch (NullPointerException e2) {
            System.out.println("Une méthode dans la classe 'CréationTabArn' a échoué à cause d'un appel" +
                    " d'une valeur nulle !");
        }catch (NumberFormatException e3) {
            System.out.println("Une méthode de la classe 'Similarité' a échoué à cause d'un appel" +
                    " de mauvais type (Ex: String lors d'un appel double ou int et vise-versa) !");
        }catch (ArithmeticException e4) {
            System.out.println("Une méthode de la classe 'Similarité' a échoué à cause d'une division par " +
                    "zéro lors des calculs des méthodes de déviations !");
        }
    }
}

