package ru.zinnur.biller.model;

import java.math.BigDecimal;

/**
 * Платёж клиента.
 *
 * @author Zinnur Khayatdinov on 22.05.2018
 */
public class Payment {

  private Long id;

  private Long account;

  private BigDecimal amount;

  private Customer customer;

  private BillerCompany billerCompany;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getAccount() {
    return account;
  }

  public void setAccount(Long account) {
    this.account = account;
  }

  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  public BillerCompany getBillerCompany() {
    return billerCompany;
  }

  public void setBillerCompany(BillerCompany billerCompany) {
    this.billerCompany = billerCompany;
  }
}
