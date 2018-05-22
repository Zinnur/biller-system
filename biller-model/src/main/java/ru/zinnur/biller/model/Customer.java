package ru.zinnur.biller.model;

import java.util.Date;

/**
 * Клиент платежей.
 *
 * @author Zinnur Khayatdinov on 21.05.2018
 */
public class Customer {

  private Long id;

  private String firstName;

  private String lastName;

  private Date birthDate;

  private String address;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Date getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(Date birthDate) {
    this.birthDate = birthDate;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }
}
