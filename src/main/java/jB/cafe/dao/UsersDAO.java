package jB.cafe.dao;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import jB.cafe.entity.User;

@Repository
@Transactional
public class UsersDAO {
	
	@PersistenceContext
	private EntityManager em;

	public List<User> findAll() {
		return em.createQuery("FROM User", User.class).getResultList();
	}
	
	public User findById(Long id) {
		return em.find(User.class, id);
	}
	
	public void update(User user) {
		em.merge(user);
	}
	
	public void create(User user) {
		em.persist(user);
	}
	
	public void delete(Long id) {
		User user = em.getReference(User.class, id);
		em.remove(user);
	}
	
	////////////////////////////////////////////////
	
	public Set<String> findAllCategories() {
		List<String> categoryList = em.createQuery("SELECT DISTINCT category FROM User", String.class)
				.getResultList();
		return new TreeSet<>(categoryList);
	}
	
	public List<User> findByCategory(String category) {
		return em.createQuery("FROM Item WHERE category = :cat", User.class)
				.setParameter("cat", category)
				.getResultList();
	}
	
	public List<User> findByKeyword(String keyword) {
		return em.createQuery("FROM Item WHERE LOWER(name) LIKE :regex", User.class)
				.setParameter("regex", "%" + keyword.toLowerCase() + "%")
				.getResultList();
	}
	
	public User findByName(String name) {
		try {
			return em.createQuery("FROM Item WHERE name = :name", User.class)
					.setParameter("name", name)
					.getSingleResult();
		} catch (NoResultException ex) {
			return null;
		}
	}
}

