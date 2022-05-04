package com.anhduc.curd_spring_angula;

import com.anhduc.curd_spring_angula.dao.DAO;
import com.anhduc.curd_spring_angula.model.Course;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class CurdSpringAngulaApplication {

//    private static DAO<Course> dao;
//
//    public CurdSpringAngulaApplication(DAO<Course> dao){
//        this.dao = dao;
//    }
    public static void main(String[] args) {
        SpringApplication.run(CurdSpringAngulaApplication.class, args);

//        List<Course> courses = dao.list();
//        courses.forEach(System.out::println);
    }

}
