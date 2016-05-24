package lgs.service;

import java.util.List;

import lgs.entity.Authot;

public interface AuthotS {

	void save(String name);
	List<Authot> findAll();
	Authot findOne(int id);
	
}
