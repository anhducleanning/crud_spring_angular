package com.anhduc.curd_spring_angula.serivce;

import com.anhduc.curd_spring_angula.model.Course;

import java.util.List;

public interface CourseDao<T>{

    List<T> list();

     Course create(T t);

    Course findById(int id);

    Course update(Course course, int id);

    void delete(int id);
}
