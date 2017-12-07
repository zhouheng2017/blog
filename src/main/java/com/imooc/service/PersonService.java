package com.imooc.service;

import com.imooc.dao.PersonDAO;
import com.imooc.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired private PersonDAO personDAO;//使用Autowire的进行自动装配，无需get/set方法
    public List<Person> getPersons() {
        return null;
    }

    public void addPerson(Person person) {

    }

    public void updatePerson(Person person) {

    }

    public void deletePerson(Person person) {

    }
}
