import java.util.*;

public class Main {
    public static void main(String[] args) {
        String a = "AACAGUAAA";
        String b = "AAAUGG";
        int maximale = 10;
        int minimale;
        ArrayList<Integer> longueurTempo = new ArrayList<Integer>();
        ArrayList<Integer> longueurFinale = new ArrayList<Integer>();

//        System.out.println(a.indexOf('A'));
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                if (b.charAt(j) == a.charAt(i)) {
                    longueurTempo.add(Math.abs(j - i));
                } else if (longueurTempo.isEmpty()) {
                    minimale = maximale;
                } else if (j == (b.length() - 1)) {
                    minimale = longueurTempo.indexOf(Collections.min(longueurTempo));
                    longueurFinale.add(minimale);
                    longueurTempo.clear();
                }
            }
        }
        System.out.println(longueurTempo);
        System.out.println(longueurFinale);
    }

    ArrayList<Integer> distances = new ArrayList<Integer>();
//        distances.add(3);
//        alist.add("Tim");

//    //displaying elements
////        System.out.println(distances);
////
////    //Adding "Steve" at the fourth position
////        distances.add(1,44);
////
////    //displaying elements
////        System.out.println(distances);

    public static void calculdistances(String ARN1, String ARN2) {
        String a = "ACCGGA";
        String b = "AAAAAG";
    }
}


