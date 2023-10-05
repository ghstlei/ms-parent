package com.microservice.employeeleaveservice.model;
import jakarta.persistence.*;
import java.util.Date;
import lombok.*;

@Entity
@Table(name = "employee_leave")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeLeave {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private String client_id;
  private int employee_id;
  private String leave_type;
  private Date leave_date;
  private int number_days;
  private Date return_date;

  // calcular data de retorno



}
