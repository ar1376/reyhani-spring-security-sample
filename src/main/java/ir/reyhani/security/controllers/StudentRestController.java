package ir.reyhani.security.controllers;

import ir.reyhani.security.models.dtos.StudentCreateDTO;
import ir.reyhani.security.models.dtos.StudentDTO;
import ir.reyhani.security.services.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * @author Ahmadreza Reyhani
 * @since 7/28/2024 - 12:07 PM
 */

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/students")
public class StudentRestController {

    private final StudentService studentService;

    @GetMapping(path = "/{studentId}")
    public StudentDTO getStudent(@PathVariable("studentId") Integer studentId) {
        return studentService.findById(studentId);
    }

    @PostMapping
    public StudentDTO save(@RequestBody StudentCreateDTO studentCreateDTO) {
        return studentService.save(studentCreateDTO);
    }
}
