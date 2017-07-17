package com.personal;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by mac on 17/07/2017.
 */
public interface PersonRepository extends JpaRepository<Person, Long> {

}
