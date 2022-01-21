package aav.prj.course_int.services;

import aav.prj.course_int.domain.Course;
import aav.prj.course_int.domain.Subject;

import java.util.List;
import java.util.Optional;
import java.util.Set;

/**
 * @author Alejandro Arango
 */
public interface CourseService {


    void createCourse(String name);

    List<Course> getCourseList();

    Optional<Course> getCourse(Long id);


}
