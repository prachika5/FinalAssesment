package com.Password.password.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Password.password.dto.PersonDTO;
import com.Password.password.entity.Person;
import com.Password.password.repository.PersonRepository;

@RestController
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

   /* @PostMapping("/person")
    public Person createPerson(@RequestBody Person person) {
        // Generate password
        String password = generatePassword(person.getFirstName(), person.getMiddleName(), person.getLastName());
        person.setPassword(password);

        return personRepository.save(person);
    }

    private String generatePassword(String firstName, String middleName, String lastName) {
        // Generate password logic
        // Assuming names are not null and have at least 2 characters each
        String password = (firstName.substring(0, 2) + middleName.substring(0, 2) + lastName.substring(0, 2))
                .toUpperCase();
        password += String.format("%03d", (int) (Math.random() * 1000));
        return password;
    }
    
    */
    
    @PostMapping("/person")
    @ResponseBody
    public String createPerson(@RequestBody PersonDTO personDTO) {
        // Here you can process the received data and store it in the database
        // For demonstration purposes, let's just print the received data
        System.out.println("Received data: " + personDTO.toString());

        // Return a response to the client (optional)
        return "Data received successfully!";
    }
    
}
