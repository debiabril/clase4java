package org.example;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date(2023, 11, 14, 10, 0, 0);
        System.out.println("1. “The Scientist ” recién se lanza(tiene popularidad normal).  \n");
        Song song = new Song("A Rush of Blood to the head", "The Scientist", "Coldplay", 2002, 10, 1, 1000, date);
        song.show();
        System.out.println("2. “The Scientist ” está en auge por superar el mínimo de reproducciones esperadas. \n");
        song.setTotalViews(1001);
        song.toBoom();
        song.show();
        System.out.println("3. “The Scientist ” baja del auge por tener muchos dislikes. \n");
        song.setDislikes(5001);
        song.toRegular();
        song.show();
        System.out.println("4. “The Scientist ” es tendencia por récord de reproducciones y cantidad de personas que le gusta el tema. \n");
        song.setTotalViews(50001);
        song.setLikes(20001);
        song.toTrend();
        song.show();
        System.out.println("5. “The Scientist” era tendencia pero vuelve a ser normal por no ser escuchada en las últimas horas. \n");
        song.setLastView(new Date(2023, 11, 13, 9, 0, 0));
        song.show();

    }
}