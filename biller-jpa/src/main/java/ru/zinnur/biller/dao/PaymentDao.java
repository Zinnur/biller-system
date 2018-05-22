package ru.zinnur.biller.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import ru.zinnur.biller.jpa.entities.PaymentEntity;

/**
 * DAO для работы с платежами клиента.
 *
 * @author Zinnur Khayatdinov on 22.05.2018
 */
public class PaymentDao {

  @PersistenceContext
  private EntityManager em;

  public PaymentEntity save(PaymentEntity paymentEntity) {
    em.persist(paymentEntity);
    return paymentEntity;
  }

  public List<PaymentEntity> findByCustomerId(Long customerId) {
    // SQL: SELECT p.* FROM PAYMENTS p WHERE CUSTOMER_ID = :customerId;
    TypedQuery<PaymentEntity> query = em
        .createQuery("SELECT p FROM PaymentEntity p WHERE PaymentEntity.cusmomer.id=:customerId",
            PaymentEntity.class);
    query.setParameter("customerId", customerId);
    return query.getResultList();
  }

  public List<PaymentEntity> findByBillerId(Long billerId) {
    TypedQuery<PaymentEntity> query = em
        .createQuery("SELECT p FROM PaymentEntity p WHERE p.billerCompony.id=:billerId",
            PaymentEntity.class);
    query.setParameter("billerId", billerId);
    return query.getResultList();
  }
}
