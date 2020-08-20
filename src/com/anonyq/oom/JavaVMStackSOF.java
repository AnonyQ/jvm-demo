package com.anonyq.oom;

/**
 * @author lisainan
 * @since 2020/8/20
 */
public class JavaVMStackSOF {
    public int stackLength = 1;
    public void stackLeak() {
        stackLength ++;
        stackLeak();
    }

    public static void main(String[] args) {
        JavaVMStackSOF vmStackSOF = new JavaVMStackSOF();
        try {
            vmStackSOF.stackLeak();
        } catch (Throwable e) {
            System.out.println("stack length: " + vmStackSOF.stackLength);
            e.printStackTrace();
        }
    }
}
