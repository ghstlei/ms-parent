package com.microservice.employeeservice.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "employee")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;

  private int client_id;
  private String name;
  private long national_identity;
  private Date birthdate;
  private int job_position;
  private boolean activity;
  private BigDecimal salary;
  private String type;
  
}