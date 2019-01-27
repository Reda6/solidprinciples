package com.reda.singleresponsiblity;

public class TextBad {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public TextBad(String text) {
        this.text = text;
    }

    public  void print()
    {
        System.out.println(text);
    }
}
