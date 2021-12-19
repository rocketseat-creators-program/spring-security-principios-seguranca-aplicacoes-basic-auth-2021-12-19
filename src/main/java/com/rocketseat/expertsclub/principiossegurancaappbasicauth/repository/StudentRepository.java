package com.rocketseat.expertsclub.principiossegurancaappbasicauth.repository;

import com.rocketseat.expertsclub.principiossegurancaappbasicauth.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
