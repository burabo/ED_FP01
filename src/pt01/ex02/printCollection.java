/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt01.ex02;

import java.util.Collection;

/**
 *
 * @author Gabriel Santos
 */
public class printCollection {

    
    static void printCollection(Collection<?> c) {
        for (Object e : c) {
            System.out.println(e);
        }
    }
}
