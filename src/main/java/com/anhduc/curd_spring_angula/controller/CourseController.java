package com.anhduc.curd_spring_angula.controller;

import com.anhduc.curd_spring_angula.dao.CourseJdbcDao;
import com.anhduc.curd_spring_angula.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@Controller
//@RestController
public class CourseController {

    @Autowired
    CourseJdbcDao dao;

    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @GetMapping("/list")
    public String displayCourse(){
        List<Course> courses = dao.list();
        courses.forEach(System.out::println);
        return "index";
    }

    @GetMapping("/getone")
    public String getOne(){
        Optional<Course> firsOne = dao.get(1);
        System.out.println(firsOne.get());
        return "index";
    }

    @GetMapping("/update")
    public String updateCourse(){
        Course course = new Course("Anh Duc","Anh Duc","ANH duC");

        dao.update(course,4);
        return "index";
    }


    @GetMapping("/delete")
    public String deleteCouse(){
       dao.delete(2);
        return "index";
    }



    @GetMapping("/post")
    public String postCourse(){
        Course springCour = new Course("Spring","New Spring","https://www.youtube.com/watch?v=bXpwNyDS6LQ");
        dao.create(springCour);
        return "index";
    }
}
