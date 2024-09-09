package org.lsh.two;

public class Test1 {

    private static Test a;

    public static void main(String[] args) throws InterruptedException {
        a = new Test();

        System.out.println(a);
        //这里直接把a赋值为null，这样前面的对象我们不可能再得到了
        a = null;
        //手动申请执行垃圾回收操作（注意只是申请，并不一定会执行，但是一般情况下都会执行）
        System.gc();
        //等垃圾回收一下
        Thread.sleep(1000);

        System.out.println(a);
    }

    private static class Test {
        @Override
        protected void finalize() throws Throwable {
            System.out.println("save");
            a = this;
        }
    }
}
