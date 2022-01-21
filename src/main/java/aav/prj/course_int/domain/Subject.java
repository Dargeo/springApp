package aav.prj.course_int.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Alejandro Arango
 */
@Entity
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private int credits;
    private int UMI;
    private Long price;

    @ManyToMany
    @JoinTable(name="course_subject", joinColumns = @JoinColumn(name= "subject_id"), // Join Table with courses to define their relationship.
                inverseJoinColumns = @JoinColumn(name= "course_id"))
    private Set<Course> courses = new HashSet<>();


    public Subject(String name, int credits, int UMI, Long price) {// Constructor of subjects.
        this.name = name;
        this.credits = credits;
        this.UMI = UMI;
        this.price = price;
        this.courses = new HashSet<>();
    }



}
