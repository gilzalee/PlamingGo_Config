package com.tech.PlamingGo.dto;

import java.util.Date;

public class DramaDto {
	private int drama_code;
	private String drama_title;
	private String drama_img;
	private String drama_age;
	private int drama_epi;
	private String drama_summary;
	private String drama_director;
	private String drama_actor;
	private String drama_genre;
	private String drama_nation;
	private Date drama_date;
	private int drama_rating;
	
	public DramaDto(int drama_code, String drama_title, 
			String drama_img, String drama_age, 
			int drama_epi, String drama_summary, 
			String drama_director, String drama_actor, 
			String drama_genre, String drama_nation,
			Date drama_date, int drama_rating) {
		this.drama_code = drama_code;
		this.drama_title = drama_title;
		this.drama_img = drama_img;
		this.drama_age = drama_age;
		this.drama_epi = drama_epi;
		this.drama_summary = drama_summary;
		this.drama_director = drama_director;
		this.drama_actor = drama_actor;
		this.drama_genre = drama_genre;
		this.drama_nation = drama_nation;
		this.drama_date = drama_date;
		this.drama_rating = drama_rating;
	}

	public int getDrama_code() {
		return drama_code;
	}

	public void setDrama_code(int drama_code) {
		this.drama_code = drama_code;
	}

	public String getDrama_title() {
		return drama_title;
	}

	public void setDrama_title(String drama_title) {
		this.drama_title = drama_title;
	}

	public String getDrama_img() {
		return drama_img;
	}

	public void setDrama_img(String drama_img) {
		this.drama_img = drama_img;
	}

	public String getDrama_age() {
		return drama_age;
	}

	public void setDrama_age(String drama_age) {
		this.drama_age = drama_age;
	}

	public int getDrama_epi() {
		return drama_epi;
	}

	public void setDrama_epi(int drama_epi) {
		this.drama_epi = drama_epi;
	}

	public String getDrama_summary() {
		return drama_summary;
	}

	public void setDrama_summary(String drama_summary) {
		this.drama_summary = drama_summary;
	}

	public String getDrama_director() {
		return drama_director;
	}

	public void setDrama_director(String drama_director) {
		this.drama_director = drama_director;
	}

	public String getDrama_actor() {
		return drama_actor;
	}

	public void setDrama_actor(String drama_actor) {
		this.drama_actor = drama_actor;
	}

	public String getDrama_genre() {
		return drama_genre;
	}

	public void setDrama_genre(String drama_genre) {
		this.drama_genre = drama_genre;
	}

	public String getDrama_nation() {
		return drama_nation;
	}

	public void setDrama_nation(String drama_nation) {
		this.drama_nation = drama_nation;
	}

	public Date getDrama_date() {
		return drama_date;
	}

	public void setDrama_date(Date drama_date) {
		this.drama_date = drama_date;
	}

	public int getDrama_rating() {
		return drama_rating;
	}

	public void setDrama_rating(int drama_rating) {
		this.drama_rating = drama_rating;
	}

}
