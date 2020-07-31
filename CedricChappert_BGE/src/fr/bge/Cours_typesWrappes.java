package fr.bge;

public class Cours_typesWrappes {

	public static void main(String[] args) {
		
		int i = 0;
		System.out.println(i);
		
		Integer j = null;
		j = Integer.valueOf(10);
		System.out.println(j.toString());
		
		j = i; 	// java prends le type primitif int dans le type wrappe
				// car il convertit en faisant j = Integer.valueOf(i)
		
		j = null;
		//i = j.intValue(); 	// je prends le type wrappe (class)
							// si j est null l operation est impossible
							// parce que la valeur null  n a pas d equivalent 
							// poiur un type primitif
		
		Integer k = null;
		k = Integer.valueOf(4);
		System.out.println(k);		
	}
}
