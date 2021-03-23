// DATA ACESS LAYER: Communicate w/ db
// StudentRepository JPA naming convention when working with db
package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// JpaRepository needs to specify type <Student> and id type <Long>
// Connect this interface by bringing it into the appropriate service (StudentService)
@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
    
}
