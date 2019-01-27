package com.reda.singleresponsiblity;

public class PrintBetter {
    private Text texte;

    public Text getTexte() {
        return texte;
    }

    public void setTexte(Text texte) {
        this.texte = texte;
    }

    public PrintBetter(Text texte) {
        this.texte = texte;
    }

    public void Print(Text texte)
    {
        System.out.println(texte.getTexte());
    }
}
