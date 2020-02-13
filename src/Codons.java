
public enum Codons {

    GCU ("Ala"), GCC ("Ala"), GCA ("Ala"), GCG ("Ala"),

    CGU ("Arg"), CGC ("Arg"), CGA ("Arg"), CGG ("Arg"),

    AGA ("Arg"), AGG ("Arg"), AAU ("Asn"), AAC ("Asn"),

    GAU ("Asp"), GAC ("Asp"), UGU ("Cys"), UGC ("Cys"),

    GAA ("Glu"), GAG ("Glu"), CAA ("Gln"), CAG ("Gln"),

    GGU ("Gly"), GGC ("Gly"), GGA ("Gly"), GGG ("Gly"),

    CAU ("His"), CAC ("His"), AUU ("Ile"), AUC ("Ile"),

    AUA ("Ile"), UUA ("Leu"), UUG ("Leu"), CUU ("Leu"),

    CUC ("Leu"), CUA ("Leu"), CUG ("Leu"), AAA ("Lys"),

    AAG ("Lys"), AUG ("Met"), UUU ("Phe"), UUC ("Phe"),

    CCU ("Pro"), CCC ("Pro"), CCA ("Pro"), CCG ("Pro"),

    UAG ("Pyl"), UGA ("Sec"), UCU ("Ser"), UCC ("Ser"),

    UCA ("Ser"), UCG ("Ser"), AGU ("Ser"), AGC ("Ser"),

    ACU ("Thr"), ACC ("Thr"), ACA ("Thr"), ACG ("Thr"),

    UGG ("Trp"), UAU ("Tyr"), UAC ("Tyr"), GUU ("Val"),

    GUC ("Val"), GUA ("Val"), GUG ("Val"), UAA ("Fin"),

    ;

    public String codons1;


    Codons(String codons1) {

        this.codons1 = codons1;
    }

    public static String getabbCodons(Codons codon) { ;
        return codon.codons1;
    }
}
