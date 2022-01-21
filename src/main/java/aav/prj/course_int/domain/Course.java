package aav.prj.course_int.domain;

import lombok.*;

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
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //Definition of the ID
    private Long id;


    private String name;
    private int price;

    @ManyToMany(mappedBy = "courses")
    private Set<Subject> subjects; // Subjects set of a course(Instance of a new set)

    public Course(String name, int price) {   //Constructor of courses
        this.name = name;
        this.price = price;
        this.subjects = new HashSet<>();
    }

    public Course addSubject(Subject subject){
        subject.getCourses().add(this);
        this.subjects.add(subject);
        return this;
    }
    public Course removeSubject(Subject subject){
        if(this.subjects.contains(subject)){
            subject.getCourses().remove(this);
            this.subjects.remove(subject);
        }else {
            System.out.println("Subject " + subject.getName() + " doesn´t exists in course " + this.name);
        }
        return this;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int calcPrice(){
        return this.subjects.stream().map(Subject::getPrice).reduce(0,(x,y)->x+y);

    }



}
