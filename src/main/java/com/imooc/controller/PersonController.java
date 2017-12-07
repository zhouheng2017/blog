package com.imooc.controller;

import com.imooc.entity.Person;
import com.imooc.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/person")
public class PersonController {

    @Autowired private PersonService personService;

    @RequestMapping(value = "/getPersons")
    @ResponseBody
    public List<Person> getPersons() {

        return personService.getPersons();
    }

    @RequestMapping(value = "/getPersonById")
    public Person getPersonById(String id) {
        return personService.getPersonById(id);
    }

    @RequestMapping(value = "/addPerson")
    public void addPerson(Person person) {
        personService.addPerson(person);

    }

    @RequestMapping(value = "/updatePerson")
    public void updatePerson(Person person) {
        personService.updatePerson(person);

    }

    @RequestMapping(value = "/deletePersonById")
    public void deletePersonById(String id) {
        personService.deletePersonById(id);

    }
}
