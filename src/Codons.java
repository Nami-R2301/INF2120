/**
 * Cette classe d'énumération sert à instancier plusieurs codons, ainsi que leurs correspondance en abbréviation
 * pour pouvoir appelé ceux-ci plus tard et les comparés tous avec les codons dans les tableaux en attributs (
 * tabArnA et tabArnB) sans avoir a utiliser des switch/cases.
 */
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

    public String codons1;      //Abbréviation de chaque objet Codons.


    Codons(String codons1) {

        this.codons1 = codons1;
    }

    /**
     * Cette méthode retourne  l'abbréviation d'un objet (Codons) passé en paramètre.
     * @param codon Le codon contenant l'attibut 'codons1'.
     * @return L'abbréviation en String.
     */
    public static String getabbCodons(Codons codon) { ;
        return codon.codons1;
    }
}
