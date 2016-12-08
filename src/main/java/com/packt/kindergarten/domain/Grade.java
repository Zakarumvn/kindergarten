package com.packt.kindergarten.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by Zakarum on 2016-12-02.
 */
@Entity
@Table(name="grade")
public class Grade {
    @Id
    private Long idGrade;
    private Boolean isActive;
    private Date startDate;
    private Date endDate;
    private String gradeName;


    public Grade() {
    }

    public Grade(Long gradeID, Date inaugurationDate, Date endDate, String gradeName) {
        this.idGrade = gradeID;
        this.isActive = true;
        this.startDate = inaugurationDate;
        this.endDate = endDate;
        this.gradeName = gradeName;
    }

    public Long getIdGrade() {
        return idGrade;
    }

    public void setIdGrade(Long gradeID) {
        this.idGrade = gradeID;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date inaugurationDate) {
        this.startDate = inaugurationDate;
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