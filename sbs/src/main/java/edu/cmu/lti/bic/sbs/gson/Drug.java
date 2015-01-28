package edu.cmu.lti.bic.sbs.gson;

public class Drug {
	private String name = "";
	private String description = "";
	private String id = "";
	
	private float does;
	
	public Drug(){
		
	}
	


	//constructor without does
	public Drug(String name, String description, String id) {
		super();
		this.name = name;
		this.description = description;
		this.id = id;
	}

	public Drug(String name, String description, String id, float does) {
		super();
		this.name = name;
		this.description = description;
		this.id = id;
		this.does = does;
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
	
	
	public float getDoes() {
		return does;
	}

	public void setDoes(float does) {
		this.does = does;
	}

}
