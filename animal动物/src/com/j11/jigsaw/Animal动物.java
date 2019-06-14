package com.j11.jigsaw;

/**
 * <pre>
 * <b>Description</b>
 * </pre>
 * <pre>
 * 创建时间 2019-06-14 09:48
 * 所属工程： j11-jigsaw-101  </pre>
 *
 * @author sheldon yhid: 80752866
 */
public interface Animal动物 {
    default void yell(){
        pre();
        System.out.println("I'm Animal动物");
    }

    private void pre(){
        System.out.println("interface");
    }

    void eat();
}
