/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt01.ex02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author Gabriel Santos
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Exercício 2
        
        System.out.println("Exercício 2\n");
        
        Pair<Integer> t1 = new Pair<Integer>(-2, 22);
        System.out.println(t1.max());

        //Exercício 3
        
        System.out.println("\nExercício 3\n");
        
        UnorderedPair<String> p1 = new UnorderedPair<String>("cão", "gato");
        UnorderedPair<String> p2 = new UnorderedPair<String>("gato", "cão");
        if (p1.equals(p2)) {
            System.out.println(p1.getFirst() + " e " + p1.getSecond() + " é igual a");
            System.out.println(p2.getFirst() + " e " + p2.getSecond());
        } else {
            System.out.println(p1.getFirst() + " e " + p1.getSecond() + " não é igual a");
            System.out.println(p2.getFirst() + " e " + p2.getSecond());
        }

        //Exercício 4
        
        System.out.println("\nExercício 4\n");
        
        List<?> c = new ArrayList<UnorderedPair>();
        ((List<UnorderedPair>) c).add(p1);  
        ((List<UnorderedPair>) c).add(p2); 
        printCollection.printCollection(c);
        
        
        //Exercício 5
        
        System.out.println("\nExercício 5\n");
        
        System.out.println("\n ? extends Shape \n");
    }

}
