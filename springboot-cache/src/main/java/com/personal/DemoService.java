package com.personal;

/**
 * Created by mac on 17/07/2017.
 */
public interface DemoService {
    Person save(Person person);

    void remove(Long id);

    Person findOne(Person person);
}
