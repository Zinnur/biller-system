package ru.zinnur.biller.jpa.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Zinnur Khayatdinov on 20.05.2018
 */
@Entity
@Table(name = "CUSTOMERS")
public class CustomerEntity implements Serializable {

  @Id
  @GeneratedValue(generator = "SEQ_IDENT", strategy = GenerationType.SEQUENCE)
  private Long id;

  @Column(name = "FIRST_NAME")
  private String firstName;

  @Column(name = "LAST_NAME")
  private String lastName;

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "BIRTH_DATE")
  private Date birthDate;

  @Column(name = "ADDRESS")
  private String address;

  @OneToMany
  private List<PaymentEntity> payments;


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

  public List<PaymentEntity> getPayments() {
    return payments;
  }

  public void setPayments(List<PaymentEntity> payments) {
    this.payments = payments;
  }
}
