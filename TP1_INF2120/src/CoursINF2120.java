public class CoursINF2120 {

    /**
     * iterator () = creation d'une nouvelle boucle dans une variable de type generique pour ne pas a repeter plusieurs
     * boucles avec des initialisation de boucle for avec int i = 0, parce qu'il peut avoir des structures qui n'ont
     * ne fonctionne pas avec des indices (int i).
     *
     * En theorie:
     * Ex: I i = s.initialiseUneNouvelleBoucle();
     * while ( i.aUnSuivant() ) {
     *     E x = i.courrant();
     *     i.suivant();
     * }
     *
     * En Java:
     * S : implements Iterable
     * Iterator i = s.iterator();
     * while ( i.hasNext() ) {
     *     E x = i.next();  //next : retourne le courant et passe au suivant.
     * }
     *
     * Ex: ArrayList< Integer > a = new ArrayList<> (); //NOTE : marche seulement avec ArrayList et Vector et tableau
     *                                                  // normal ( tab [] )
     *
     *     a.add( 5 );
     *     a. add ( 21 );
     *
     *     Iterator< Integer > it = a.iterator ();
     *     while ( it.hasNext() ) {
     *         Integer x = it.next();
     *
     *         SOP ( x );
     *     }
     * Version simplifier (ecrite par Java) :   //NOTE : marche seulement avec ArrayList et Vector et tableau normal
     *                                          // ( tab [] )
     *      for ( Integer x : a ) {
     *          SOP ( x );
     *      }
     *
     * Interface RandomAccess : precise au programmeur lors de l'implementation ( implements RandomAccess ) qu'
     * il est plus preferable d'utiliser une boucle for basique avec cette classe par raison de rapidite et
     * d'efficacite.
     *
     * Fonction :
     *      f : N -> N
     *      f ( x ) = x + 3
     *      f ( 2 ) = 5
     *
     * Type de donnees pour representer les fonctions.
     *      f : T -> R
     *      abstract R nom( T x )
     *
     * Ex :
     *
     * public class Affiche implements Consumer< Integer > {
     *      @Override
     *      public void accept( Integer ) {
     *          SOP ( "x = " + x );
     *      }
     *      public static void main( String [] args ) {
     *
     *          ArrayList< Integer > a - new ArrayList<>();
     *          a.add( 3 );
     *          a.add( 5 );
     *          a.add( 7 );
     *
     *          a.forEach( new Affiche() );
     *      }
     *      Resultat a l'ecran :    x = 3
     *                              x = 5
     *                              x = 7
     * }
     *
     */
}
