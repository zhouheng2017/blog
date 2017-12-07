package com.imooc.service;

import com.imooc.dao.PersonDAO;
import com.imooc.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
//@Service组件用于标注业务层组件
@Service
public class PersonService {

    @Autowired private PersonDAO personDAO;//使用Autowire的进行自动装配，无需get/set方法

    public List<Person> getPersons() {
        return personDAO.getPersons();
    }

    public Person getPersonById(String id) {
        return personDAO.getPersonById(id);
    }

    public void addPerson(Person person) {
        personDAO.addPerson(person);

    }

    public void updatePerson(Person person) {
        personDAO.updatePerson(person);

    }

    public void deletePersonById(String id) {
        personDAO.deletePersonById(id);

    }
}
