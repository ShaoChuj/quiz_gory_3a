package com.example.quizz;

public class Pytanie {
    private int tekstPytania;
    private int[] odpowiedzi = new int[3];
    private boolean[] odpowiedzPoprawna = new boolean[3];

    public Pytanie(int tekstPytania, int[] odpowiedzi, boolean[] odpowiedzPoprawna) {
        this.tekstPytania = tekstPytania;
        this.odpowiedzi = odpowiedzi;
        this.odpowiedzPoprawna = odpowiedzPoprawna;
    }

    public int getTekstPytania() {
        return tekstPytania;
    }

    public int getOdpowiedzi(int i) {
        return odpowiedzi[i];
    }

    public boolean getOdpowiedzPoprawna(int i) {
        return odpowiedzPoprawna[i];
    }
}
