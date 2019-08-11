package org.lang;

public class StateDetails {
	public void tamilLanguage() {
		System.out.println("Language Tamil");
	}
	public void englishLanguage() {
		System.out.println("Language English");
	}
	public void hindiLanguage() {
		System.out.println("Language Hindi");
	}
	public static void main(String[] args) {
		StateDetails ab = new StateDetails();
		ab.tamilLanguage();
		ab.englishLanguage();
		ab.hindiLanguage();
		LanguageInfo cd = new LanguageInfo();
		cd.southIndia();
		cd.northIndia();
	}
		

}
