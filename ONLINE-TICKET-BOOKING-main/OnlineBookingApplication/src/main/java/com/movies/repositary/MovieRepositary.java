package com.movies.repositary;





import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import com.movies.model.Movies;
import com.movies.model1.Longin;
import com.movies.model2.Feedbackandrating;
import com.movies.model3.Organization;
import com.movies.model4.Account;





@Repository
public class MovieRepositary {


	Movies m;

	public String saveMovie(int id,String name,int price,String lang) {

		m=new Movies();
		m.setmId(id);
		m.setmName(name);
		m.setmPrice(price);
		m.setLanguge(lang);
		Configuration cfg=new Configuration().configure().addAnnotatedClass(Movies.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session sess=sf.openSession();
		Transaction tr=sess.beginTransaction();
		sess.save(m);
		tr.commit();
		sess.close();


		return "Data saved successfully";
	}
	Longin u;
	public String saveUser(String name,String uid,String password) {

		u=new Longin();

		u.setName(name);
		u.setPassword(password);
		u.setUId(uid);
		Configuration cfg=new Configuration().configure().addAnnotatedClass(Longin.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session sess=sf.openSession();
		Transaction tr=sess.beginTransaction();


		sess.save(u);
		tr.commit();
		sess.close();


		return "Data saved successfully";
	}
	Feedbackandrating fe;
	public String saveFeedback(String feed,String rate) {

		fe=new Feedbackandrating();

		fe.setFeedback(feed);
		fe.setRating(rate);

		Configuration cfg=new Configuration().configure().addAnnotatedClass(Feedbackandrating.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session sess=sf.openSession();
		Transaction tr=sess.beginTransaction();


		sess.save(fe);
		tr.commit();
		sess.close();


		return "Data saved successfully";
	}
	
	public String saveAser(String name,String uid,String password,String empid) {

		u=new Longin();

		u.setName(name);
		u.setPassword(password);
		u.setUId(uid);
		u.setEmloyeeId(empid);
		Configuration cfg=new Configuration().configure().addAnnotatedClass(Longin.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session sess=sf.openSession();
		Transaction tr=sess.beginTransaction();


		sess.save(u);
		tr.commit();
		sess.close();


		return "Data saved successfully";
	}
	Organization o;
	public String saveArser(String name,String uid,String password) {
          o=new Organization();
		o.setOrganizationName(name);
		o.setAdmin(uid);
		o.setGSTNUMBER(password);
		
		Configuration cfg=new Configuration().configure().addAnnotatedClass(Organization.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session sess=sf.openSession();
		Transaction tr=sess.beginTransaction();


		sess.save(o);
		tr.commit();
		sess.close();


		return "Data saved successfully";
	}
	Account A;
	
		public String savediatials(String name,long accn,int pin,double bal) {

			A=new Account();
			A.setName(name);
			A.setPin(pin);
			A.setAccno(accn);
			A.setBal(bal);
			Configuration cfg=new Configuration().configure().addAnnotatedClass(Account.class);
			SessionFactory sf=cfg.buildSessionFactory();
			Session sess=sf.openSession();
			Transaction tr=sess.beginTransaction();
			sess.save(A);
			tr.commit();
			sess.close();


			return "Data saved successfully";
		}

}