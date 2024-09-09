package org.lsh.one;

public class Main {

    static {
        System.load("E:\\Code\\Raise\\Jvm-QingKong\\src\\main\\java\\org\\lsh\\c\\test.dll");
    }

    public static void main(String[] args) {
        System.out.println(sum(1, -2));
    }

    public static native int sum(int a, int b);
}