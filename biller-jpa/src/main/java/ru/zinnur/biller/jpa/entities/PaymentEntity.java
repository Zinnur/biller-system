package ru.zinnur.biller.jpa.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Zinnur Khayatdinov on 21.05.2018
 */
@Entity
@Table(name = "PAYMENTS")
public class PaymentEntity implements Serializable {

  @Id
  private Long id;

  @ManyToOne
  private CustomerEntity cusmomer;

//@Column(name = "CUSTOMER_ID")
  //private Long cusmomerId;

  @ManyToOne
  private BillerComponyEntity billerCompony;


//@Column(name = "BILLER_ID")
  //private Long billerCompanyId;

  @Column(name = "ACCOUNT")
  private Long account;
  @Column(name = "AMOUNT")
  private BigDecimal amount;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

//  public Long getCusmomerId() {
//    return cusmomerId;
//  }
//
//  public void setCusmomerId(Long cusmomerId) {
//    this.cusmomerId = cusmomerId;
//  }
//
//  public Long getBillerCompanyId() {
//    return billerCompanyId;
//  }
//
//  public void setBillerCompanyId(Long billerCompanyId) {
//    this.billerCompanyId = billerCompanyId;
//  }
//
//  public Long getAccount() {
//    return account;
//  }

  public void setAccount(Long account) {
    this.account = account;
  }

  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public CustomerEntity getCusmomer() {
    return cusmomer;
  }

  public void setCusmomer(CustomerEntity cusmomer) {
    this.cusmomer = cusmomer;
  }

  public BillerComponyEntity getBillerCompony() {
    return billerCompony;
  }

  public void setBillerCompony(BillerComponyEntity billerCompony) {
    this.billerCompony = billerCompony;
  }
}
