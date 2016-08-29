package com.fusani.numbershapes;

/**
 * Created by blamb on 8/29/16.
 *
 * I wouldn't normally make this a separate class but this is part of a course and it
 * specifically asks for it to be done this way.
 */
public class Number
{
    protected int number;

    public Number(int num) {
        this.number = num;
    }

    public boolean isTriangular() {
        int comp = 8 * this.number + 1;
        return this.isSquare(comp);
    }

    public boolean isSquare() {
        return this.isSquare(this.number);
    }

    protected boolean isSquare(int num) {
        if (num < 0) {
            return false;
        }

        long test = (long)(Math.sqrt(num) + 0.5);
        return test * test == num;
    }
}
