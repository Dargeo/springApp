package aav.prj.course_int.services.implementations;

import aav.prj.course_int.domain.Course;
import aav.prj.course_int.repositories.CourseRepository;
import aav.prj.course_int.services.interfaces.CourseApiService;
import aav.prj.course_int.services.interfaces.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

/**
 * @author Alejandro Arango
 */
public class CourseServiceImpl implements CourseService, CourseApiService {


    @Autowired
    private CourseRepository courseRepository;

    private RestTemplate restTemplate;


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


    @Override
    public Object getApi(String url) {
        return restTemplate.getForObject(url,Object.class);
    }
}
