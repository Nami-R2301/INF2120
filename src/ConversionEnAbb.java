import java.util.ArrayList;

public class ConversionEnAbb extends CreationTabArn {

    public void tranformationEnAbb(ArrayList<String> tabArnA) {
        ArrayList<String> arnA = new ArrayList<String>();
        for ( int i = 0; i < tabArnA.size(); ++i ) {
        }
    }


    public ConversionEnAbb(String arnA, String arnB, int distanceMax) {
        super(arnA, arnB, distanceMax);
        tranformationEnAbb(tabArnA);

    }
}
