package lgs.service.imp;

import java.util.List;

import lgs.dao.BookD;
import lgs.entity.Book;
import lgs.service.BookS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookSI implements BookS{

	@Autowired
	private BookD bookD;
	@Transactional
	public void save(String title) {
		// TODO Auto-generated method stub
		bookD.save(new Book(title));
	}

	public List<Book> findAll() {
		return bookD.findAll();
	}

	public Book findOne(int id) {
		return bookD.findOne(id);
	}

	public BookD getBookD() {
		return bookD;
	}

	public void setBookD(BookD bookD) {
		this.bookD = bookD;
	}

	
}
