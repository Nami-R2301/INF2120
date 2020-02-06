
public enum EnumerationAcideAmine {

    GCU ("Ala"), GCC ("Ale"), GCA ("Ale"), GCG ("Ale"),

    CGU ("Arg"), CGC ("Arg"), CGA ("Arg"),

    CGG ("Arg"), AGA ("Arg"), AGG ("Arg"),

    AAU ("Asn"), AAC ("Asn"),

    GAU ("Asp"), GAC ("Asp"),

    UGU ("Cys"), UGC ("Cys"),

    GAA ("Glu"), GAG ("Glu"),

    CAA ("Gln"), CAG ("Gln"),

    GGU ("Gly"), GGC("Gly"), GGA ("Gly"), GGG ("Gly"),

    CAC,CAU, AUU, AUC, AUA, UUA, UUG, CUU, CUC, CUA, AAA, AAG, AUG, UUU, UUC, CCU, CCC, CCA, CCG, UAG,
    UGA, UCU, AGU, ACU, UGG, UAU, GUU, UAA,
    ;

    public String acideAmine1;


    EnumerationAcideAmine(String acideAmine1) {
        this.acideAmine1 = acideAmine1;
    }

    public String getAcideAmine1() {
        return acideAmine1;
    }

    @Override
    public String toString() {
        return " Abbréviation = " + acideAmine1;
    }
}
