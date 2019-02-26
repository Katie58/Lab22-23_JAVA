package jB.cafe.dao;

import java.util.List;
//import java.util.Set;
//import java.util.TreeSet;

import javax.persistence.EntityManager;
//import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import jB.cafe.entity.CartItem;
import jB.cafe.entity.Item;

@Repository
@Transactional
public class CartDAO {
	
	@PersistenceContext
	private EntityManager em;

	public List<CartItem> findAll() {
		return em.createQuery("FROM CartItem", CartItem.class).getResultList();
	}
	
	public CartItem findById(Long id) {
		return em.find(CartItem.class, id);
	}
	
	public void update(CartItem cartItem) {
		em.merge(cartItem);
	}
	
	public void create(CartItem cartItem) {
		em.persist(cartItem);
	}
	
	public void delete(Long id) {
		CartItem cartItem = em.getReference(CartItem.class, id);
		em.remove(cartItem);
	}
	
	public void delete(CartItem cartItem) {
		em.remove(em.contains(cartItem) ? cartItem : em.merge(cartItem));
	}
	
	public boolean contains(CartItem cartItem) {
		return em.contains(cartItem);
	}
	
}

