package lgs.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;

import lgs.dao.BookD;
import lgs.entity.Authot;
import lgs.entity.Book;
@Repository
public class BookDI implements BookD{

	EntityManager manager;
	public void save(Book book) {
		manager.persist(book);
	}

	public List<Book> findAll() {
		
		return manager.createQuery("from Book", Book.class).getResultList();
	}

	public Book findOne(int id) {
		
		return manager.find(Book.class, id);
	}


}
