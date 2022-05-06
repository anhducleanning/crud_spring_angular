package com.anhduc.curd_spring_angula.controller;

import com.anhduc.curd_spring_angula.serivce.SerivceCource;
import com.anhduc.curd_spring_angula.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ControllerCourse {

        @Autowired
        SerivceCource dao;

        @GetMapping("/all")
        public ResponseEntity<List<Course>> getAllCourse(){
            List<Course> courses = dao.list();
            return new ResponseEntity<>(courses, HttpStatus.OK);
        }

        @GetMapping("/find/{id}")
        public ResponseEntity<Course> getCourseId(@PathVariable("id") int id){
               Course course = dao.findById(id);
                return new ResponseEntity<>(course,HttpStatus.OK);
        }

        @GetMapping("/delete/{id}")
         public void deleteById(@PathVariable("id") int id){
             dao.delete(id);
        }

        @PostMapping("/add")
        public ResponseEntity<Course> addCourse(@RequestBody Course course){
            Course newCourse = dao.create(course);
            return new ResponseEntity<>(newCourse,HttpStatus.CREATED);
        }

        @PutMapping("/update/{id}")
        public ResponseEntity<Course> updateCourse(@RequestBody Course course, @PathVariable("id") int id){
            Course updateCourse = dao.update(course,id);
            return new ResponseEntity<>(updateCourse,HttpStatus.OK);
        }

        @DeleteMapping("/delete/{id}")
        public ResponseEntity<?> deleteCourse(@PathVariable("id") int id ){
            dao.delete(id);
            return new ResponseEntity<>(HttpStatus.OK);
    }

}
