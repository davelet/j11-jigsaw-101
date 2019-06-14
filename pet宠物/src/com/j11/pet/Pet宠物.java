package com.j11.pet;

import com.j11.jigsaw.Animal动物;

/**
 * <pre>
 * <b>Description</b>
 * </pre>
 * <pre>
 * 创建时间 2019-06-14 09:49
 * 所属工程： j11-jigsaw-101  </pre>
 *
 * @author sheldon yhid: 80752866
 */
public class Pet宠物 implements Animal动物 {

    @Override
    public void eat() {
        // when it eats, it just yell out.
        yell();
    }

    @Override
    public void yell() {
        System.out.println("I'm Pet宠物");
    }
}
