/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt01.ex02;

/**
 *
 * @author Gabriel Santos
 * @param <T>
 */
public class UnorderedPair<T extends Comparable> extends Pair<T> {

    public UnorderedPair() {
        setFirst(null);
        setSecond(null);
    }

    public UnorderedPair(T firstItem, T secondItem) {
        setFirst(firstItem);
        setSecond(secondItem);
    }

    public boolean equals(Object otherObject) {
        if (otherObject == null) {
            return false;
        } else if (getClass() != otherObject.getClass()) {
            return false;
        } else {
            UnorderedPair<T> otherPair = (UnorderedPair<T>) otherObject;
            return (getFirst().equals(otherPair.getFirst()) && getSecond().equals(otherPair.getSecond())) || (getFirst().equals(otherPair.getSecond()) && getSecond().equals(otherPair.getFirst()));
        }
    }
    
    @Override
     public String toString() {
        return ("first: " + getFirst().toString() + "\n" + "second: " + getSecond().toString());
    }
}


