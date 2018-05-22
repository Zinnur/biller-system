package ru.zinnur.biller.jpa.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Zinnur Khayatdinov on 21.05.2018
 */
@Entity
@Table(name = "BILLER_COMPANYS")
public class BillerComponyEntity  implements Serializable {
  @Id
  @GeneratedValue(generator = "SEQ_IDENT", strategy = GenerationType.SEQUENCE)
  private Long id;
  @Column(name = "BILLER_COMPANY_NAME")
  private String billerCompanyName;

  @OneToMany
  private List<PaymentEntity> payments;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getBillerCompanyName() {
    return billerCompanyName;
  }

  public void setBillerCompanyName(String billerCompanyName) {
    this.billerCompanyName = billerCompanyName;
  }

  public List<PaymentEntity> getPayments() {
    return payments;
  }

  public void setPayments(List<PaymentEntity> payments) {
    this.payments = payments;
  }
}
