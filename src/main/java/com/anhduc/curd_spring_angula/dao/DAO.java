package com.anhduc.curd_spring_angula.dao;

import com.anhduc.curd_spring_angula.model.Course;

import java.util.List;
import java.util.Optional;

public interface DAO <T>{

    List<T> list();

    void create(T t);

    Optional<T> get(int id);

    void update(Course course, int id);

    void delete(int id);
}
