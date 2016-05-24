package lgs.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import lgs.dao.AuthotD;
import lgs.entity.Authot;
import lgs.entity.Book;

@Repository
public class AuthotDI implements AuthotD {

	@PersistenceContext
	EntityManager manager;

	public void save(Authot authot) {
		// TODO Auto-generated method stub
		manager.persist(authot);
	}

	public List<Authot> findAll() {
		// TODO Auto-generated method stub
		return manager.createQuery("from Authot",Authot.class).getResultList();
	}

	public Authot findOne(int id) {
		// TODO Auto-generated method stub
		return manager.find(Authot.class, id);
	}

	


}
