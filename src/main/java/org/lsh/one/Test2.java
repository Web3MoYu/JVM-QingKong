package org.lsh.one;

public class Test2 {

    public static void main(String[] args) {
        int res = a();
        System.out.println(res);
    }

    private static int a() {
        return b();
    }

    private static int b() {
        return c();
    }

    private static int c() {
        int a = 10;
        int b = 20;
        return a + b;
    }

}
