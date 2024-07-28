package ir.reyhani.security.models;

import jakarta.persistence.*;

/**
 * @author Ahmadreza Reyhani
 * @since 7/28/2024 - 12:09 PM
 */

@Entity
@Table(name = "student")
public class Student {

    @Id
    @Column(name = "student_id", unique = true, nullable = false)
    @SequenceGenerator(name = "student_sequence", sequenceName = "student_sequence")
    @GeneratedValue(generator = "student_sequence", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(name = "name")
    private String name;

    public Student() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
