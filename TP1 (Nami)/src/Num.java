import java.util.ArrayList;

public enum Num {
    Ala ("GCU", "GCC" , "GCA" , "GCG", null, null),
    Arg ("CGU", "CGC", "CGA", "CGG", "AGA", "AGG"),
    Asn ("AAU", "AAC", null, null, null, null),
    Asp ("GAU", "GAC", null, null, null, null),
    Cys ("UGU", "UGC", null, null, null, null),
    ;
    public String acideAmine1;
    public String acideAmine2;
    public String acideAmine3;
    public String acideAmine4;
    public String acideAmine5;
    public String acideAmine6
            ;

    Num(String acideAmine1, String acideAmine2, String acideAmine3, String acideAmine4,
        String acideAmine5, String acideAmine6) {

        this.acideAmine1 = acideAmine1;
        this.acideAmine2 = acideAmine2;
        this.acideAmine3 = acideAmine3;
        this.acideAmine4 = acideAmine4;
        this.acideAmine5 = acideAmine5;
        this.acideAmine6 = acideAmine6;
    }

    public String getAcideAmine1() {
        return acideAmine1;
    }

    public String getAcideAmine2() {
        return acideAmine2;
    }

    public String getAcideAmine3() {
        return acideAmine3;
    }

    public String getAcideAmine4() {
        return acideAmine4;
    }

    public String getAcideAmine5() {
        return acideAmine5;
    }

    public String getAcideAmine6() {
        return acideAmine6;
    }
}
