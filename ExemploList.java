import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {

        List<Double> notas = new ArrayList<Double>();
        notas.add(7.2);
        notas.add(4.5);
        notas.add(9.7);
        notas.add(0.1);
        notas.add(2.8);
        notas.add(6.9);
        notas.add(5.3);
        System.out.println(notas.toString());


        System.out.println("Exiba a posição da nota 5.3: " + notas.indexOf(5.3));


        /*System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8.0);
        System.out.println(notas);*/



        /*System.out.println("Substitua a nota 9.7 por 6.4: ");
        notas.set(notas.indexOf(9.7), 6.4);
        System.out.println(notas);*/


        System.out.println("Confira se a nota 9.7 está na lista: " + notas.contains(9.7));


        System.out.println("Exibas todas as notas na ordem em que foram informados: ");
        for (Double nota : notas) System.out.println(nota);


        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas.toString());


        System.out.println("Exiba a menor nota: " + Collections.min(notas));


        System.out.println("Exiba a maior nota: " + Collections.max(notas));



        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()) {

            Double next = iterator.next();
            soma += next;

        }
        System.out.println("Exiba a soma das notas: " + soma);



        System.out.println("Exiba a media das nota: " + (soma/notas.size()));



       /* System.out.println("Remova a nota 2.8: ");
        notas.remove(2.8);
        System.out.println(notas);*/



        /*System.out.println("Remova a nota da posição 0");
        notas.remove(0);
        System.out.println(notas);*/


       /* System.out.println("Remova todas as notas abaixo de 7.0: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas);


        System.out.println("Apague toda a lista: ");
        notas.clear();
        System.out.println(notas);*/


        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());


        List<Double> notas2 = new ArrayList<Double>(notas);
        notas2.add(8.7);
        notas2.add(2.0);
        notas2.add(9.0);
        notas2.add(9.5);

        System.out.println("Nova lista: " + notas2);

        System.out.println("Mostrar a primeira nota sem removela: " + notas2.get(0));


        notas2.remove(0);
        System.out.println("Moestre a primeira nota removendo-a: " + notas2.get(0));



    }
}
