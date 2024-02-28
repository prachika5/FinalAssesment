package com.Password.password.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.Password.password.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
