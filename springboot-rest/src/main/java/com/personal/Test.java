package com.personal;

import java.util.Random;

/**
 * Created by mac on 16/07/2017.
 */
public class Test {
    public static void main(String[] args) {
        String[] address = new String[] {};
        String[] names1 = new String[] {};
        String[] names2 = new String[] {};
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            System.out.println("insert into person(address, name, age) values('" + address[random.nextInt(address.length)] + "','"
                + names1[random.nextInt(names1.length)] + names2[random.nextInt(names2.length)] + "','" +
                    (20 + random.nextInt(70)) + "');");
        }
    }
}
