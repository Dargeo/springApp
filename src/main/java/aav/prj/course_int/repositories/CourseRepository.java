package aav.prj.course_int.repositories;

import aav.prj.course_int.domain.Course;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

/**
 * @author Alejandro Arango
 */
public interface CourseRepository extends CrudRepository<Course, Long> {
    List<Course> findAll();
    Optional<Course> findById(Long id);
}
