package org.example;

import java.util.StringJoiner;

public class Box implements Comparable<Box> {
    private final int a;
    private final int b;
    private final int c;
    private final int pl;

    public Box(int a, int b, int c, int pl) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.pl = pl;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", "Box", " ")
                .add("mass =" + this.mass())
                .toString();
    }

    public int mass(){
        return this.a * this.b * this.c * this.pl;
    }

    @Override
    public int compareTo(Box o) {
        return -this.mass()+o.mass();
    }
}
