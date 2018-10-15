/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt01.ex01;

import java.util.Scanner;

/**
 *
 * @author Gabriel Santos
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        TwoTypePair<String, String> t1 = new TwoTypePair<String, String>("Happy", "Day");
        Scanner Keyboard = new Scanner(System.in);
        System.out.println("Introduza 2 palavras:");
        String a = Keyboard.next();
        String b = Keyboard.next();
        TwoTypePair<String, String> t2 = new TwoTypePair<String, String>(a, b);
        if (t2.equals(t1)) {
            System.out.println("Acertaste!!!");
        } else {
            System.out.println("Erraste...");
            System.out.println("A tua resposta:");
            System.out.println(t2);
            System.out.println("A resposta certa:");
            System.out.println(t1);
        }
    }
    
}
