package fr.aba.kata.mini;

import fr.aba.kata.mini.funct.Divisible;

import static java.lang.Character.getNumericValue;
import static java.util.stream.Collectors.joining;


public class FooBarQix {
	
	private static FooBarQix instance;
	
	
	/**
	 * Interdiction de création d'objet
	 * pour contraintre à passer par le design pattern singleton pour ne pas créer beaucoup d'objets inutiles
	 */
	private FooBarQix() {}
	
	
	/**
	 * 
	 * s'assurer que l'on retourne une seul instance à chaque fois 
	 */
	public static FooBarQix getInstance() {
		if(instance == null)
			return new FooBarQix();
		return instance;
	}
	
	
	/**
	 * 
	 * @param numberSaisi
	 * @retourne la valeur correcte qui doit être afficher
	 */
	public  String traiterFooBarQiX(int numberSaisi) {
		
		String resultat = "";
		
		resultat = divisibleBy(numberSaisi);
		
		resultat = contains( numberSaisi, resultat);
		
		return resultat;
		
	}
	
	/**
	 * 
	 * @param numberPut
	 * @retourne la valeur corresponante pour les divisible de 3 et 5
	 */
	private String divisibleBy(int numberPut) {
		
		String resultat="";
			
			Divisible divsible = x ->  getResuDiv( x);
			
		    resultat=divsible.traiter(numberPut);
		  
	    return resultat;
		
	}
	/**
	 * 
	 * @param x
	 * @retourne le resultat la chaine correspondant au divisible de 3 et 5
	 */
	private String getResuDiv(int x) {
			if(x%3==0)
			   return FooBarQixVAL.FOO.toString();
			if(x%5==0)
				return FooBarQixVAL.BAR.toString();
			return "";
		
	}
	/**
	 * 
	 * @param val
	 * @returne la chaine correspondante aux valeurs fournies en entrées 
	 */
	private  String getResu(int val ) {
		String str = new String("");
		if(val==3)
			str=FooBarQixVAL.FOO.toString();
		else if(val==5)
			str=FooBarQixVAL.BAR.toString();
		else if(val==7)
			str=FooBarQixVAL.QIX.toString();
		
		 return str;
		
	}
	
	/**
	 * 
	 * @param saisi
	 * @param resultat
	 * @retourne le valeur après avoir tester si le nombre contient 3 , 5 et 7
	 */
	private  String contains(int saisi,String resultat) {
		
		String ree  =  String.valueOf(saisi);
		
		String resuReel=ree.chars().mapToObj(x->getResu(getNumericValue(x) )).collect(joining());
		
		StringBuffer strBuffer = new StringBuffer(resultat);
		
		strBuffer.append(resuReel);
		
		 
		return strBuffer.toString().isEmpty()?ree:strBuffer.toString();
		 
			
	}
	
}
