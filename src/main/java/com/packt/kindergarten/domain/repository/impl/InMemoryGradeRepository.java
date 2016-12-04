package com.packt.kindergarten.domain.repository.impl;

import com.packt.kindergarten.domain.Grade;
import com.packt.kindergarten.domain.repository.GradeRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Zakarum on 2016-12-02.
 */

@Repository
public class InMemoryGradeRepository implements GradeRepository {

    public InMemoryGradeRepository() {

    }

    @Override
    public List<Grade> getAllGrades() {
        return null;
    }
}
