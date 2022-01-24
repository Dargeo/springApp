package aav.prj.course_int.controllers.templates;

import aav.prj.course_int.services.implementations.CourseServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Alejandro Arango
 */
@Controller
public class IndexTemplateController extends CourseServiceImpl {


    @RequestMapping({"","/"})
    public String getIndexPage(){
        System.out.println(getCourseList());
        return "index";
    }
}
