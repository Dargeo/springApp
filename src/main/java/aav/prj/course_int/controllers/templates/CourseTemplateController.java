package aav.prj.course_int.controllers.templates;

import aav.prj.course_int.services.CourseServiceImpl;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Alejandro Arango
 */
public class CourseTemplateController extends CourseServiceImpl {

    @RequestMapping("/courses")
    public String coursesList(Model model){
        model.addAttribute("authors", getCourseList());
        return "course/courseList";
    }
}
