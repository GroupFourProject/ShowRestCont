package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Show;
@Service
public class ShowService {
	@Autowired
	ShowDAO showDAOimpl;
public void add(Show s) {
	showDAOimpl.addShow(s);
}

public Show findShow(int id) {
	return showDAOimpl.find(id);
}

public List<Show> findAllShows(){
	return showDAOimpl.findAll();
}

public boolean update(Show show) {
	return showDAOimpl.updateShow(show);
}

public boolean delete(int id) {
	return showDAOimpl.deleteShow(id);
}



	

}
