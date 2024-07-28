package ir.reyhani.security.repositories;

import ir.reyhani.security.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Ahmadreza Reyhani
 * @since 7/28/2024 - 12:19 PM
 */

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
