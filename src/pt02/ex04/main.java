/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt02.ex04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

        List<String> c = new ArrayList<>(5);
        c.add("Cão");
        c.add("Rato");c.add("Gato");
        c.add("Coelho");
        c.add("Galinha");
        
        
        Collections.sort(c, Comparator.comparing(String::length));
        System.out.println(c); 
    }

}
