package com.bext.dto;

public class Contract {
	private String name;
	private int Id;
	
	
	public Contract() {
		super();
	}

	public Contract(String name, int id) {
		super();
		this.name = name;
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	@Override
	public String toString() {
		return "Contract [name=" + name + ", Id=" + Id + "]";
	}
	
	

}
