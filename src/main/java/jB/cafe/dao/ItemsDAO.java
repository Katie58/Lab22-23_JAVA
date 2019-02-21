package jB.cafe.dao;

import java.util.List;
//import java.util.Set;
//import java.util.TreeSet;

import javax.persistence.EntityManager;
//import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import jB.cafe.entity.Item;

@Repository
@Transactional
public class ItemsDAO {
	
	@PersistenceContext
	private EntityManager em;

	public List<Item> findAll() {
		return em.createQuery("FROM Item", Item.class).getResultList();
	}
	
	public Item findById(Long id) {
		return em.find(Item.class, id);
	}
	
	public void update(Item item) {
		em.merge(item);
	}
	
	public void create(Item item) {
		em.persist(item);
	}
	
	public void delete(Long id) {
		Item item = em.getReference(Item.class, id);
		em.remove(item);
	}
	
	////////////////////////////////////////////////
	
//	public Set<String> findAllCategories() {
//		List<String> categoryList = em.createQuery("SELECT DISTINCT category FROM Item", String.class)
//				.getResultList();
//		return new TreeSet<>(categoryList);
//	}
//	
//	public List<Item> findByCategory(String category) {
//		return em.createQuery("FROM Item WHERE category = :cat", Item.class)
//				.setParameter("cat", category)
//				.getResultList();
//	}
//	
//	public List<Item> findByKeyword(String keyword) {
//		return em.createQuery("FROM Item WHERE LOWER(name) LIKE :regex", Item.class)
//				.setParameter("regex", "%" + keyword.toLowerCase() + "%")
//				.getResultList();
//	}
//	
//	public Item findByName(String name) {
//		try {
//			return em.createQuery("FROM Item WHERE name = :name", Item.class)
//					.setParameter("name", name)
//					.getSingleResult();
//		} catch (NoResultException ex) {
//			return null;
//		}
//	}
}

