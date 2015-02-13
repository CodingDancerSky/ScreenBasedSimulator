package edu.cmu.lti.bic.sbs.gson;

public class Drug {
	private String name = "";
	private String description = "";
	private String id = "";
	public Drug(){
	    this.name = "Default Drug";
	    this.description = "Default description";
	    this.id = "Default id";
	}
	public Drug setName(String name){
		this.name = name;
		return this;
	}
	public Drug setDescription(String description) {
		this.description = description;
		return this;
	}
	public Drug setId(String id){
		this.id = id;
		return this;
	}
	public String getName(){
		return name;
	}
	public String getId(){
		return id;
	}
	public String getDescription(){
		return description;
	}
	
	public Drug(String n, String d, String i){
	  this.name = n;
	  this.description = d;
	  this.id = i;
	}
}
