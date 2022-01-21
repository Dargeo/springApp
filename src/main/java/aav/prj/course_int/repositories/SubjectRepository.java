package aav.prj.course_int.repositories;

import aav.prj.course_int.domain.Subject;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

/**
 * @author Alejandro Arango
 */
public interface SubjectRepository extends CrudRepository<Subject,Long> {
    List<Subject> findAll();
    Optional<Subject> findById(Long id);
}
