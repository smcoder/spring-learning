package com.personal;

/**
 * Created by mac on 16/07/2017.
 */
public interface DemoService {
    Person savePersonWithRollBack(Person person);

    Person savePersonWithoutRollBack(Person person);
}
