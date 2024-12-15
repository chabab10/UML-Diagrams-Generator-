package org.java.mql.models;


public class Relation {
	private Classe parent;
	private Classe child;
	private String type;
	private String parentCardinality;
	private String childCardinality;

	public Relation() {
		// TODO Auto-generated constructor stub
	}

	public Classe getParent() {
		return parent;
	}

	public void setParent(Classe parent) {
		this.parent = parent;
	}

	public Classe getChild() {
		return child;
	}

	public void setChild(Classe child) {
		this.child = child;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getParentCardinality() {
		return parentCardinality;
	}

	public void setParentCardinality(String parentCardinality) {
		this.parentCardinality = parentCardinality;
	}

	public String getChildCardinality() {
		return childCardinality;
	}

	public void setChildCardinality(String childCardinality) {
		this.childCardinality = childCardinality;
	}



}