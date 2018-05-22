package ru.zinnur.biller.model;

/**
 * Платежная компания.
 *
 * @author Zinnur Khayatdinov on 22.05.2018
 */
public class BillerCompany {

  private Long id;
  private String billerCompanyName;

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
}
