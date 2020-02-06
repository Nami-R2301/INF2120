import java.util.ArrayList;

public class ConversionEnAbb extends CreationTabArn {

    public void tranformationEnAbb(ArrayList<String> tabArnA) {
        ArrayList<String> arnA = new ArrayList<String>();
        for ( int i = 0; i < tabArnA.size(); ++i ) {
            switch ( tabArnA.get(i) ) {
                case EnumerationAcideAmine.AAG:
                    tabArnA.set( i, "Ala" );
                case EnumerationAcideAmine.AAA:
                    tabArnA.set( i, "Arg" );
                case EnumerationAcideAmine.AAC:
                    tabArnA.set( i, "Asn" );

                default:
                    tabArnA.set( i, null );
            }
        }
    }


    public ConversionEnAbb(String arnA, String arnB, int distanceMax) {
        super(arnA, arnB, distanceMax);
        tranformationEnAbb(tabArnA);

    }
}
