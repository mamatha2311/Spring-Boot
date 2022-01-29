package com.example.myweb.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alien {

	@Id
	private int aid;
	private String aName;
	private String lang;
	
	public Alien() {
		System.out.println("inside Alien");
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aName=" + aName + ", lang=" + lang + "]";
	}
	
}
