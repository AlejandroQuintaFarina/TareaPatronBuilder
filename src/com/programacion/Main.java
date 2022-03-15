package com.programacion;

import java.util.Locale;

import static javax.sound.sampled.FloatControl.Type.PAN;

public class Main {

    public static void main(String[] args) {
       //  BuilderPizzas miBuilder = new BuilderPizzas();
        // BuilderPizzas miBuilder2 = miBuilder.setTipoMasa(PAN);

        Pizzas creadaConBuilder = new BuilderPizzas().build();
        Pizzas sintaxisEncadenada = new BuilderPizzas()
                .setCebolla(true)
                .setSize(BIG)
                .build();
        System.out.println(creadaConBuilder.toString());
        System.out.println(sintaxisEncadenada.toString());
    }
    }
}
