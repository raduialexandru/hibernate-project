package repository;

import model.Motherboard;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.List;

public class MotherboardRepository implements HibernateRepository<Motherboard> {

    private final EntityManager entityManager;

    public MotherboardRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void save(Motherboard object) {
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        entityManager.persist(object);
        entityTransaction.commit();
    }

    @Override
    public List<Motherboard> findAll() {
        return null;
    }

    @Override
    public Motherboard findById(int id) {
        return (Motherboard) entityManager.createQuery("SELECT m FROM Motherboard m WHERE m.id = :id")
                .setParameter("id", id)
                .getSingleResult();
    }

    @Override
    public Motherboard update(Motherboard object) {
        return entityManager.merge(object);
    }

    @Override
    public void remove(Motherboard object) {

    }

    public Motherboard getById(int id) {
        return entityManager.find(Motherboard.class, id);
    }
}
