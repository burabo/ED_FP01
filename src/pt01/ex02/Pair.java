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
public class Pair<T extends Comparable> {

    private T first;
    private T second;

    public Pair() {
        this.first = null;
        this.second = null;
    }

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    public T max() {
        if (first.compareTo(second) >= 0) {
            return first;
        } else {
            return second;
        }
    }
}
