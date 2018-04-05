package com.example.java;

import com.example.java.model.Olive;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Olive> olives= new ArrayList<>();
        olives.add(new Olive(Olive.KALAMATA, 0x2E0854, 3));
        olives.add(new Olive(Olive.KALAMATA, 0x2E0854, 3));
        olives.add(new Olive(Olive.LIGURIAN, 0x00000, 2));
        olives.add(new Olive(Olive.LIGURIAN, 0x00000, 2));
        olives.add(new Olive(Olive.LIGURIAN, 0x00000, 2));
        olives.add(new Olive(Olive.LIGURIAN, 0x00000, 2));



        OlivePress olivePress = new OlivePress();
        int totalOil = olivePress.getOil(olives);
        System.out.println("totalOil = " + totalOil);
    }
}
