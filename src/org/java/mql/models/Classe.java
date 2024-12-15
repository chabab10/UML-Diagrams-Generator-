package org.java.mql.models;

import java.util.List;
import java.util.Vector;

public class Classe {
	private List<Attribut> attributes;
	private List<Methode> umlMethods;
	private boolean isInterface;
	private String name;
	private List<String> parents;

	public Classe() {
		name = "";
		isInterface = false;
		attributes = new Vector<>();
		umlMethods = new Vector<>();
		parents = new Vector<>();
	}

	public List<Attribut> getUmlVariables() {
		return attributes;
	}

	public void setUmlVariables(List<Attribut> attributes) {
		this.attributes = attributes;
	}

	public List<Methode> getUmlMethods() {
		return umlMethods;
	}

	public void setUmlMethods(List<Methode> umlMethods) {
		this.umlMethods = umlMethods;
	}

	public boolean isInterface() {
		return isInterface;
	}

	public void setInterface(boolean isInterface) {
		this.isInterface = isInterface;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getParents() {
		return parents;
	}

	public void setParents(List<String> parents) {
		this.parents = parents;
	}


	public void addParent(String parent){
		this.parents.add(parent);
	}


	public boolean hasVariable(String attribut){
		for(Attribut attr : attributes){
			if(attr.getName().equalsIgnoreCase(attribut)){
				return true;
			}
		}
		return false;
	}

}