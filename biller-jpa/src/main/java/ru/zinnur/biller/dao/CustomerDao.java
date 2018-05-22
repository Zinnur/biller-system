package ru.zinnur.biller.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import ru.zinnur.biller.jpa.entities.CustomerEntity;

/**
 * DAO для работы клиентом.
 *
 * @author Zinnur Khayatdinov on 22.05.2018
 */
public class CustomerDao {

  @PersistenceContext
  private EntityManager em;


  /**
   * Находит клиента по идентификатору.
   *
   * @param id идентификатор клиента
   * @return клиент
   */
  private CustomerEntity find(Long id) {
    return em.find(CustomerEntity.class, id);
  }

  /**
   * Создаём нового клиента.
   *
   * @param customerEntity новый клиент
   */
  private CustomerEntity save(CustomerEntity customerEntity) {
    em.persist(customerEntity);
    return customerEntity;
  }

  /**
   * Обновляет клиента.
   *
   * @param customerEntity изменённый клиент
   * @return обновленный клиент
   */
  private CustomerEntity update(CustomerEntity customerEntity) {
    return em.merge(customerEntity);
  }

  /**
   * Удаляет клиента по идентификатору.
   */
  private void delete(Long id) {
    CustomerEntity customerEntity = em.find(CustomerEntity.class, id);
    em.remove(customerEntity);
  }
}
