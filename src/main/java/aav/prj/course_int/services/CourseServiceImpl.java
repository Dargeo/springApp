package aav.prj.course_int.services;

import aav.prj.course_int.domain.Course;
import aav.prj.course_int.domain.Subject;
import aav.prj.course_int.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

/**
 * @author Alejandro Arango
 */
public class CourseServiceImpl implements CourseService{


    @Autowired
    private CourseRepository courseRepository;


    @Override
    public void createCourse(String name) {

        Course curso = new Course(name, 0);
        courseRepository.save(curso);
    }

    @Override
    public List<Course> getCourseList() {
        return courseRepository.findAll();
    }

    @Override
    public Optional<Course> getCourse(Long id) {

        return courseRepository.findById(id);
    }


}
