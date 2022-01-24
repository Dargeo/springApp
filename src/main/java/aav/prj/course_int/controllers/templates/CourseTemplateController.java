package aav.prj.course_int.controllers.templates;

import aav.prj.course_int.controllers.CourseController;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

/**
 * @author Alejandro Arango
 */

public class CourseTemplateController{

    private final CourseController courseController = new CourseController();

    @RequestMapping("/courses")
    public String coursesList(Model model){
        model.addAttribute("courses", courseController.getCourseList());
        return "courses/coursesList";
    }



}
