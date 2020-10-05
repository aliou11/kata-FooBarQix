package fr.aba.kata.mini;

import fr.aba.kata.mini.funct.Divisible;

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
	 * @retourne la valeur corresponant pour les divisible de 3 et 5
	 */
	private String divisibleBy(int numberPut) {
		
		String resultat="";
		
		Divisible divsible = x -> { 
			if(x%3==0)
			   return FooBarQixVAL.FOO.toString();
			if(x%5==0)
				return FooBarQixVAL.BAR.toString();
			return "";
		  };

		  resultat=divsible.traiter(numberPut);
		  
		  return resultat;
		
	}
	
	
	/**
	 * 
	 * @param saisi
	 * @param resultat
	 * @retourne le valeur après avoir tester si le nombre contient 3 , 5 et 7
	 */
	private static String contains(int saisi,String resultat) {
		
		String ree=String.valueOf(saisi);
		StringBuffer strBuffer=new StringBuffer(resultat);
		int i=0;
		while(i<ree.length()) {
			char searchCar = ree.charAt(i);
			if(searchCar=='3')
			strBuffer.append(FooBarQixVAL.FOO);
			if(searchCar=='5')
			strBuffer.append(FooBarQixVAL.BAR);
			if(searchCar=='7')
			strBuffer.append(FooBarQixVAL.QIX);
		  i++;
		}
		
		return strBuffer.toString().isEmpty()?ree:strBuffer.toString();
			
	}
	
}
