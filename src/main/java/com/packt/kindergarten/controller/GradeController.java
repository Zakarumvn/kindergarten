package com.packt.kindergarten.controller;

import com.packt.kindergarten.domain.repository.GradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Zakarum on 2016-12-02.
 */
public class GradeController {

    @Autowired
    private GradeRepository gradeRepository;



}
