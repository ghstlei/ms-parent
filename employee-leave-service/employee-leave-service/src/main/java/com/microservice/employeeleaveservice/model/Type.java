package com.microservice.employeeleaveservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "leave_category")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Type {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private String id;

  private String name;
}
