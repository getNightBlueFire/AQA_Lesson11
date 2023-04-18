package org.example;

import java.util.StringJoiner;

public class Test implements Comparable<Test>{
    private final int a;

    public Test(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", ""+ "[", "]")
                .add("a=" + a)
                .toString();
    }

    @Override
    public int compareTo(Test o) {
        return this.a-o.a;
    }
}
