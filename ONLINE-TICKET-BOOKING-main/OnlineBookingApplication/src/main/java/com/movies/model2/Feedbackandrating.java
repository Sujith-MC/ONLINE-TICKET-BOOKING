package com.movies.model2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Feedbackandrating {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Id;
	private String rating;
	private	String feedback;


	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Feedbackandrating [rating=" + rating + ", feedback=" + feedback + "]";
	}

}
