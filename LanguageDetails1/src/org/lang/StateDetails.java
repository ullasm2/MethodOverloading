package org.lang;

public class StateDetails {

	public void southIndia() {
		System.out.println("Preferred Lang1");

	}
	public void northIndia() {
		System.out.println("Preferred Lang2");
	}
	
	public static void main(String[] args) {
		LanguageInfo ab = new LanguageInfo();
		StateDetails cd = new StateDetails();
		
		ab.englishLanguage();
		ab.hindiLanguage();
		ab.tamilLanguage();
		cd.southIndia();
		cd.northIndia();
		
	}
	
}
