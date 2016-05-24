package lgs.service.imp;

import java.util.List;

import javax.transaction.Transactional;

import lgs.dao.AuthotD;
import lgs.entity.Authot;
import lgs.service.AuthotS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthotSI implements AuthotS{

	@Autowired
	private AuthotD authotD;

	@Transactional
	public void save(String name) {
		
		authotD.save(new Authot(name));
	}

	public List<Authot> findAll() {
		return authotD.findAll();
	}

	public Authot findOne(int id) {
		return authotD.findOne(id);
	}

	public AuthotD getAuthotD() {
		return authotD;
	}

	public void setAuthotD(AuthotD authotD) {
		this.authotD = authotD;
	}
	
}
