import java.util.Scanner;
public class LetterDistance {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        char a = in.next().charAt(0);
        char b = in.next().charAt(0);
        a = Character.toLowerCase(a);
        b = Character.toLowerCase(b);
        int d1, d2;

        if ( a <= b )
        {
            d1 = b - a; // direct distance
            d2 = 26 - b + a; // distance considering wrap around
        }
        else
        {
            d1 = a - b; // direct distance
            d2 = 26 - a + b; // distance considering wrap around
        }
        int  d; // now the distance is the smallest between 'direct' and 'wrapped around'
        if ( d1 <= d2)
            d = d1;
        else
            d = d2;

        System.out.println(d);
    }
}