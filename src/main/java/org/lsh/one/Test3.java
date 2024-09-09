package org.lsh.one;

public class Test3 {

    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1.intern() == str2.intern());
        System.out.println(str1.equals(str2));
    }
}
