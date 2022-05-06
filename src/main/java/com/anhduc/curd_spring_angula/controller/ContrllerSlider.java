package com.anhduc.curd_spring_angula.controller;

import com.anhduc.curd_spring_angula.serivce.SerivceSlider;
import com.anhduc.curd_spring_angula.model.Slider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ContrllerSlider {
    @Autowired
    SerivceSlider slider;

    @GetMapping("/slider")
    public ResponseEntity<List<Slider>> getSlider(){
        List<Slider> courses = slider.getSlider();
        return new ResponseEntity<>(courses, HttpStatus.OK);
    }
}
