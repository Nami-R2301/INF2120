import java.util.*;
class CreationArray {
    public static void main(String[] args) {

        String chaineA = "AAAAAG";
        String chaineB = "AAAAAU";

        ArrayList<String> listA = new ArrayList<>();
        ArrayList<String> listB = new ArrayList<>();

        listA.add("LYS");
        listA.add("LYS");
        listB.add("LYS");
        listB.add("ASN");

        int n = listA.size();
        int m = listB.size();
        int d = 2;

        System.out.println(conversionArray(chaineA));
        System.out.println(conversionArray(chaineB));
        double formuleM = calculM(calculDistance(listA,listB,2),
                calculDistance(listB,listA,2),n,m,d);
        System.out.println(exponentielCalculM(formuleM));
    }
    public static ArrayList<String> conversionArray(String chaine){
        ArrayList<String> chaineArray = new ArrayList<>();
        for (int i=0; i < chaine.length(); i+=3) {
            chaineArray.add(chaine.substring(i, i + 3));
        }
        return chaineArray;
    }

//    public static ArrayList<String> conversionAbbArn(ArrayList chaineArray) {
//        ArrayList<String> arrayAbbArn = new ArrayList<>();
//
//    }

    public static int calculDistance(ArrayList<String> firstArray, ArrayList<String> secondArray,
                                     int distanceMaximale) {
        int distance = 0;

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
        }
        return distance;
    }

    public static double calculM(double premierChiffre, double deuxiemeChiffre, int n, int m, int d) {
        double sommeNumerateur = (premierChiffre + deuxiemeChiffre);
        int sommeDenominateur = (n + m) * d;
        return (sommeNumerateur / sommeDenominateur);
    }
    public static double exponentielCalculM(double fonctionM) {
        return Math.exp(-6 * fonctionM * fonctionM);
    }
}
