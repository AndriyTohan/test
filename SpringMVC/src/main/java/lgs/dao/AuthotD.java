package lgs.dao;

import java.util.List;

import lgs.entity.Authot;
import lgs.entity.Book;

public interface AuthotD {

	void save(Authot authot);
	List<Authot> findAll();
	Authot findOne(int id);
	
}
