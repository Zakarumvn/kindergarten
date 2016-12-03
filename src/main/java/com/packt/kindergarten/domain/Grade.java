package com.packt.kindergarten.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by Zakarum on 2016-12-02.
 */
@Entity
public class Grade {
    @Id
    private String gradeID;
    private Boolean isActive;
    private Date inaugurationDate;
    private Date endDate;
    private String gradeName;


    public Grade() {
    }

    public Grade(String gradeID, Date inaugurationDate, Date endDate, String gradeName) {
        this.gradeID = gradeID;
        this.isActive = true;
        this.inaugurationDate = inaugurationDate;
        this.endDate = endDate;
        this.gradeName = gradeName;
    }

    public String getGradeID() {
        return gradeID;
    }

    public void setGradeID(String gradeID) {
        this.gradeID = gradeID;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public Date getInaugurationDate() {
        return inaugurationDate;
    }

    public void setInaugurationDate(Date inaugurationDate) {
        this.inaugurationDate = inaugurationDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }
}