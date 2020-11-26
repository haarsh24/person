package io.springpoc.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public List<Person> getAllPerson() {
        List<Person> persons=new ArrayList<>();
        personRepository.findAll().forEach(persons::add);
        personRepository.findAll();
        return persons;
    }

    public Person getPerson(String id) {
       return personRepository.findOne(id);
    }

    public  void addPerson(Person person) {
        personRepository.save(person);
    }

    public void updatePerson(String id,Person person){
        personRepository.save(person);
    }

    public void deletePerson(String id){
        personRepository.delete(id);
    }
}