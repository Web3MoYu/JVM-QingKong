package org.lsh.two;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        ReferenceQueue<Object> queue = new ReferenceQueue<>();
        SoftReference<Object> reference = new SoftReference<>(new Object(), queue);
        System.out.println(reference);

        try {
            List<String> list = new ArrayList<>();
            while (true) list.add(new String("lbwnb"));
        } catch (Throwable t) {
            System.out.println("发生了内存溢出！" + t.getMessage());
            System.out.println("软引用对象：" + reference.get());
            System.out.println(queue.poll());
        }
    }
}
