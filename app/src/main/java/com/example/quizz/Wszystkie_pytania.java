package com.example.quizz;

public class Wszystkie_pytania {
    public Pytanie[] wszystkiePytania = new Pytanie[] {
            new Pytanie(R.string.pyt1, new int[]{
                    R.string.odp1_a,R.string.odp1_b,R.string.odp1_c}, new boolean[]{false,false,true}),

            new Pytanie(R.string.pyt2, new int[]{
                    R.string.odp2_a,R.string.odp2_b,R.string.odp2_c}, new boolean[]{false,true,true}),

            new Pytanie(R.string.pyt3, new int[]{
                    R.string.odp3_a,R.string.odp3_b,R.string.odp3_c}, new boolean[]{true,false,true}),
    };
}
