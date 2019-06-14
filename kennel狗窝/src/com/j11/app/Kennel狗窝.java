package com.j11.app;

import com.j11.jigsaw.Animal动物;
import com.j11.pet.Pet宠物;

/**
 * <pre>
 * <b>Description</b>
 * </pre>
 * <pre>
 * 创建时间 2019-06-14 10:03
 * 所属工程： j11-jigsaw-101  </pre>
 *
 * @author sheldon yhid: 80752866
 */
public class Kennel狗窝 {
    public static void main(String[] args) {
        System.out.println("starting Kennel狗窝...");
        Pet宠物 pet宠物 = new Pet宠物();
        pet宠物.eat();
        pet宠物.yell();

        Animal动物 animal动物;
    }
}
