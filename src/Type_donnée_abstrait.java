public class Type_donnée_abstrait {
	
	/**
	 * Type de données abstraite :
	 *
	 * Résumé : Décrire le comportement d'un service sans  décrire le fonctionnnement de celui-ci.
	 *
	 * Des contrats qui décrivent les services offert.
	 * Contenant: Structure de données qui contient des valeurs.
	 * Homogène : contenant qu icontient ls même valeurs (ArrayList String()).
	 * Ordonné : les valeurs sont dans une position unique (indices deans les tab).
	 * Accès séquentielle: passer par tous les indices du tableau jusqu'a la valeur recherché,
	 * alors que ArrayList() n'est pas séquentielle (get()) --> accès aléatoire.
	 * Accès spécialisé: accédé seulement au deux bouts de la liste, tab, etc...
	 *
	 * Liste contenant des elements de type T.
	 *  ( plusieurs definitions )
	 *  -commun :
	 *      Liste constructeur() // retourne une liste vide.
	 *      boolean estvide() // si contenant est vide.
	 *      <T> get( position ) // accède à une valeur et retourne (T). (accès aléatoire).
	 *      set (position, valeur ) // placer une valeur à la position. (accès aléatoire).
	 *      ajouter( valeur ) // add
	 *      ajouter( position, valeur ) // insert
	 *      <T> enlever()   // remove
	 *      <T> enlever( position ) // delete
	 *  -postiion :
	 *      Si la liste contient n elements, alors la position d'un element est entre 0 et (n-1).
	 *
	 *  -File :
	 *      (Queue) FIFO (First in, first out) --> (Séquentielle).
	 *      File constructeur()
	 *      boolean estVide()
	 *      enfiler( T ) // add à la fin de la file.
	 *      T tete() throws ExceptionEstVide // getHEAD(), plante si il n'a pas de tête.
	 *      T defiler() throws ExceptionEstVide // remove dernier élément de la file.
	 *
	 *  -Pile :
	 *      (Stack) (LIFO) --> (Last in, first out).
	 *      Pile constructeur()
	 *      boolean estVide()
	 *      enpiler( T ) //
	 *      T defiler() //
	 *      T sommet() //getSommet()
	 *
	 */
	
}
