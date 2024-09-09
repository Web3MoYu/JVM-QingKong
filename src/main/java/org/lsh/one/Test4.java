package org.lsh.one;


import java.util.ArrayList;
import java.util.List;

public class Test4 {

    public static void main(String[] args) {
        List<Test> list = new ArrayList<Test>();
        while (true) {
            list.add(new Test());
        }
    }

    static class Test {
    }
}
