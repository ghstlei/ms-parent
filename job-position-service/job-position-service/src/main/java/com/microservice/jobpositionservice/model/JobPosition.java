package com.microservice.jobpositionservice.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "job_position")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class JobPosition {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private String name;

}