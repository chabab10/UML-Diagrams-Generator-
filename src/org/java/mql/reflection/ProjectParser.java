package org.java.mql.reflection;


import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class ProjectParser {
    private String project;
	
	public ProjectParser() {
		// TODO Auto-generated constructor stub
	}

	public ProjectParser(String project) throws MalformedURLException, ClassNotFoundException  {
		this.setProject(project);
		listPackages(project);
	}


	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	 public void listPackages(String dir) throws MalformedURLException, ClassNotFoundException {

		 File binDirectory = new File(dir);
		 URL[] classPath = { binDirectory.toURI().toURL() };
		 ClassLoader classLoader = new URLClassLoader(classPath);

		 // pour obtenir la liste de tous les fichiers dans le dossier /bin
		 File[] files = binDirectory.listFiles();
		 List<String> packages = new ArrayList<>();
		 File binDir = new File(dir);

		 System.out.println(Arrays.toString(getPackages(binDir).toArray()));

	    }

	 public List<String> getPackages(File dir) {
		    // pour stocker les packages et les classes
		    List<String> packages = new Vector<>();
		    List<String> classes=new Vector<>();

		    // pour obtenir la liste des fichiers dans le dossier
		    File[] files = dir.listFiles();

		    // pour parcourez les fichiers et ajoutez des dossiers à la liste des packages
		    for (File file : files) {
		      if (file.isDirectory()) {
		        packages.add(file.getName());
		        // pour appeler la fonction récursive avec le dossier comme entrée
		        packages.addAll(getPackages(file));
		      }

		      if (file.getName().endsWith(".class")) {
			         // pour obtenir le nom de classe complet
			         String className = file.getName().replace(".class", "");
			         className = className.replace("/", ".");
			         classes.add(className);
			        System.out.println(className);
			   }

		    }

		    return packages;
		  }



	public static void main(String[] args) throws MalformedURLException, ClassNotFoundException {
		new ProjectParser("C:\\Users\\VOSTRO\\Documents\\MQL\\JAVA\\p03ReflexionAnnotation\\p03ReflexionAnnotation\\bin");
	}

	
}