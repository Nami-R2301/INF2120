import java.util.ArrayList;

public enum Codons {

    Ala("GCU", "GCC", "GCA", "GCG", null, null),
    Arg("CGU", "CGC", "CGA", "CGG", "AGA", "AGG"),
    Asn("AAU", "AAC", null, null, null, null),
    Asp("GAU", "GAC", null, null, null, null),
    Cys("UGU", "UGC", null, null, null, null),
    Glu("GAA", "GAG", null, null, null, null),
    Gln("CAA", "CAG", null, null, null, null),
    Gly("GGU", "GGC", "GGA", "GGG", null, null),
    His("CAU", "CAC", null, null, null, null),
    Ile("AUU", "AUC", "AUA", null, null, null),
    Leu("UUA", "UUG", "CUU", "CUC", "CUA", "CUG"),
    Lys("AAA", "AAG", null, null, null, null),
    Met("AUG", null, null, null, null, null),
    Phe("UUU", "UUC", null, null, null, null),
    Pro("CCU", "CCC", "CCA", "CCG", null, null),
    Pyl("UAG", null, null, null, null, null),
    Ser("UCU", "UCC", "UCA", "UCG", "AGU", "AGC"),
    Thr("ACU", "ACC", "ACA", "ACG", null, null),
    Trp("UGG", null, null, null, null, null),
    Tyr("UAU", "UAC", null, null, null, null),
    Val("GUU", "GUC", "GUA", "GUG", null, null),
    Fin("UAA", null, null, null, null, null),
    ;

    public String codons1;
    public String codons2;
    public String codons3;
    public String codons4;
    public String codons5;
    public String codons6;

    Codons(String codons1, String codons2, String codons3, String codons4, String codons5, String codons6) {
        this.codons1 = codons1;
        this.codons2 = codons2;
        this.codons3 = codons3;
        this.codons4 = codons4;
        this.codons5 = codons5;
        this.codons6 = codons6;
    }


}
