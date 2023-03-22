package repository;

import java.util.List;

public interface HibernateRepository<T> {

    void save(T object);
    List<T> findAll();
    T findById(int id);
    T update(T object);
    void remove(T object);

}
