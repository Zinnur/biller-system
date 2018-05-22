package ru.zinnur.biller.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import ru.zinnur.biller.jpa.entities.BillerComponyEntity;

/**
 * DAO для работы с платёжными компаниями.
 *
 * @author Zinnur Khayatdinov on 22.05.2018
 */
public class BillerCompanyDao {

  @PersistenceContext
  private EntityManager em;

  public BillerComponyEntity find(Long id) {
    return em.find(BillerComponyEntity.class, id);
  }

  public BillerComponyEntity save(BillerComponyEntity billerComponyEntity) {
    em.persist(billerComponyEntity);
    return billerComponyEntity;
  }

  public BillerComponyEntity update(BillerComponyEntity billerComponyEntity) {
    return em.merge(billerComponyEntity);
  }

  public void delete(Long id) {
    BillerComponyEntity billerComponyEntity = em.find(BillerComponyEntity.class, id);
    em.remove(billerComponyEntity);
  }
}
