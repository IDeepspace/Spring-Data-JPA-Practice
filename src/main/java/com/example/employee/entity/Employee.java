package com.example.employee.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table
public class Employee {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)

  private long id;
  private String name;
  private Integer age;
  private String gender;
  private Integer companyId;
  private Integer salary;


  public Employee(long id, String name, Integer age, String gender, Integer companyId,
      Integer salary) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.companyId = companyId;
    this.salary = salary;
  }

  public Employee(String name, Integer age, String gender, Integer salary, Integer companyId, long id) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.salary = salary;
    this.companyId = companyId;
    this.id = id;
  }

  public Employee() {
  }


  public long getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public Integer getCompanyId() {
    return companyId;
  }

  public void setCompanyId(Integer companyId) {
    this.companyId = companyId;
  }

  public Integer getSalary() {
    return salary;
  }

  public void setSalary(Integer salary) {
    this.salary = salary;
  }
}
