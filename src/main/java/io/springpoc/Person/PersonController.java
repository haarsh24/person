package io.springpoc.Person;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping("/persons")
    public List<Person> getAllPerson(){
        return personService.getAllPerson();
    }

    @RequestMapping("/persons/{id}")
    public Person getPerson(@PathVariable String id){
        return personService.getPerson(id);
    }

    @RequestMapping(method = RequestMethod.POST, value="/persons")
    public void addPerson(@RequestBody Person person){
         personService.addPerson(person);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/persons/{id}")
    public void updatePerson(@RequestBody Person person, @PathVariable String id){
        personService.updatePerson(id,person);
    }

    @RequestMapping(method = RequestMethod.DELETE, value="/persons/{id}")
    public void deletePerson(@PathVariable String id){
        personService.deletePerson(id);
    }
}
