package com.movies.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.movies.model.Movies;
import com.movies.repositary.MovieRepositary;

@Service
public class MovieService {

	@Autowired
	MovieRepositary repo;

	public String insertMovie(int id,String name,int price,String lang) {

		String result=repo.saveMovie(id, name, price,lang);

		return result;
	}

	@Autowired
	MovieRepositary repo1;
	public String insertUser(String name,String Uid,String password) {

		String result=repo1.saveUser( name, Uid, password);

		return result;
	}
	@Autowired
	MovieRepositary repo2;
	public String insertFeedback(String feed,String rate) {

		String result=repo2.saveFeedback( feed,  rate);

		return result;
	}
	@Autowired
	MovieRepositary repo3;
	public String insertAser(String name,String Uid,String password,String empid) {

		String result=repo1.saveAser( name, Uid, password,empid);

		return result;
	}
	@Autowired
	MovieRepositary repo4;
	public String insertArser(String name,String Uid,String password) {

		String result=repo1.saveArser( name, Uid, password);

		return result;
	}
	@Autowired
	MovieRepositary repo5;
	public String insertDitails(String name,long accn,int pin,double bal) {

		String result=repo5.savediatials(name, accn, pin, bal);

		return result;
	}
}