// SERVICE LAYER: Business Logic

package com.example.demo.student;

// import java.time.LocalDate;
// import java.time.Month;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service    // Defines this as a Service component (a Spring bean). Automatically instantiated to @Autowired
public class StudentService {

    // Bring in StudentRepository to communicate w/ db
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents() {
        return studentRepository.findAll();
        // return List.of(
        //     new Student(
        //         1L,
        //         "Djangus",
        //         "Djangus@gmail.com",
        //         LocalDate.of(2000, Month.JANUARY, 5),
        //         21
        //     )
        // );
    }
}
