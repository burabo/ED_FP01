/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt02.ex01;

import java.awt.Point;
import java.util.ArrayList;

/**
 *
 * @author Gabriel Santos
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Exercício 01
        System.out.println("\nExercício 1\n");

        System.out.println("a: correcta; b: Classe, Tipo parametrizado; c: classe genérica; d:");

        //Exercíco 02
        System.out.println("\nExercício 2\n");

        Point[] a = new Point[10];
        Object[] b;
        b = a;

        for (Object i : b) {
            System.out.println(i);
        }

        b[0] = new Point(10, 20);

        b[0] = "Magical Mystery Tour";

        //a[0] = "Magical Mystery Tour";
        
        //Exercício 3
        
        System.out.println("\nExercício 3\n");
        
        ArrayList<Point> x = new ArrayList<Point>();
        ArrayList<Point> y;
        y = x;
        y.add(new Point(10, 20));
     
    

    }

}
