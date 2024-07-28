package ir.reyhani.security.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import ir.reyhani.security.models.Student;
import ir.reyhani.security.models.dtos.StudentCreateDTO;
import ir.reyhani.security.models.dtos.StudentDTO;
import ir.reyhani.security.repositories.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Ahmadreza Reyhani
 * @since 7/28/2024 - 12:28 PM
 */

@Service
@AllArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;
    private final ObjectMapper objectMapper;

    @Transactional
    public StudentDTO save(StudentCreateDTO studentCreateDTO) {
        return objectMapper.convertValue(studentRepository.save(objectMapper.convertValue(studentCreateDTO, Student.class)), StudentDTO.class);
    }

    @Transactional(readOnly = true)
    public StudentDTO findById(Integer id) {
        return objectMapper.convertValue(studentRepository.getReferenceById(id), StudentDTO.class);
    }

}
