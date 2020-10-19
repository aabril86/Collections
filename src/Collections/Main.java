package Collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {

        Random r = new Random();
        List<Llapis> caixa1 = new ArrayList<>();
        List<Llapis> caixa2 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Llapis llapis = new Llapis();
            llapis.setColor(ThreadLocalRandom.current().nextInt(8));
            caixa1.add(llapis);
        }


        for (int i = 0; i < 10; i++) {
            Llapis llapis = new Llapis();
            llapis.setColor(ThreadLocalRandom.current().nextInt(7));
            llapis.setGruix(0.1f + r.nextFloat() * (3.0f - 0.1f));
            caixa2.add(llapis);
        }

        //MOSTRAR

        System.out.println("CAIXA 1:");
        for (int i = 0; i < caixa1.size() ; i++) {
            System.out.println(caixa1.get(i).getColor());
        }

        System.out.println("CAIXA 2:");
        for (Llapis l: caixa2) System.out.println("Color: " + l.getColor() + " | Gruix:  " + l.getGruix() );

        //COMPARAR
        caixa1.sort(Comparator.comparing(Llapis::getColor));
    }

}
