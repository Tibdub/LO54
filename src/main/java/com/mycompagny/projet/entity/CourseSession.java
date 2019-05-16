/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompagny.projet.entity;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author thiba
 */


@Entity
@Table(name = "course_session")
public class CourseSession {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(table = "course_session", name = "id_course_session")
    private Long id;
    
    
    private Long idLocation;

    private Long courseCode;
    
    
  //  @Column(table = "course_session", name = "start_date")
    private Date startDate;
    
  //  @Column(table = "course_session", name = "end_date")
    private Date endDate;
    
 //   @Column(table = "course_session", name = "maxentrant")
    private Long maxEntrant;
    
    
    
}
